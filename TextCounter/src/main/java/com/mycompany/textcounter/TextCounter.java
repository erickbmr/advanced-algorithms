package com.mycompany.textcounter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextCounter {
    public static void main(String[] args) throws IOException {
        List<String> firstFile = readFile("\\teste1.txt", UTF_8);
        
        List<Paragraph> paragraphs = new ArrayList<>();
        List<String> buffer = new ArrayList<>();
        
        int firstLine = 0;
        for(String line : firstFile){
            if(buffer.isEmpty())
            {
                firstLine = firstFile.indexOf(line);
            }
            if(!line.isEmpty())
            {
                buffer.add(line);
            } 
            else 
            {
                if(!buffer.isEmpty())
                {
                    Paragraph paragraph = handleParagraphPhrases(buffer);
                    paragraph.phrases = handlePhraseWords(paragraph);
                    paragraph.repetitions = handleParagraphWords(paragraph);
                    paragraph.firstLine = firstLine;
                    paragraphs.add(paragraph);
                }
                
                buffer = new ArrayList<>();
            }
        }
        
        startResponse(paragraphs, "teste1-output.txt");
    }
    
    private static Paragraph handleParagraphPhrases(List<String> buffer){
        Paragraph paragraph = new Paragraph();
        List<String> phraseBuffer = new ArrayList<>();
        
        for(String line : buffer){            
            if(!line.contains("."))
            {
                phraseBuffer.add(line);
            }
            else
            {
                String period = line.substring(0, line.indexOf(".") + 1);
                phraseBuffer.add(period);
                
                Phrase phrase = handlePhrase(phraseBuffer);
                if(!phrase.period.isBlank()){
                    paragraph.phrases.add(phrase);
                    paragraph.period = paragraph.period.concat(phrase.period);    
                }
                
                phraseBuffer = new ArrayList<>();
                if(!line.endsWith(".")){
                    period = line.substring(line.indexOf("."), line.length());
                    phraseBuffer.add(period);
                }
            }
        }
        
        return paragraph;
    }
    
    private static List<Phrase> handlePhraseWords(Paragraph paragraph){
        String aux;
        String[] words;
        for(Phrase phrase : paragraph.phrases){
            aux = getLineWithoutPunctuations(phrase.period);
            words = aux.split(" ");
            for(String word : words){
                if(!isStopWord(word))
                {
                    phrase.words.add(new Word(1, word));
                }
                else
                {
                    phrase.stopWords.add(new Word(1, word));
                }
            }
            
            phrase.words = getCountedWords(phrase.words);
            phrase.stopWords = getCountedWords(phrase.stopWords);
        }
        
        return paragraph.phrases;
    }
    
    private static List<Word> handleParagraphWords(Paragraph paragraph){
        for(Phrase phrase : paragraph.phrases){
            for(Word word : phrase.words){
                if(word.counter > 1){
                    Word repetition = new Word(word.counter, word.word);
                    repetition.distance = getDistanceWords(paragraph.period, word.word);
                    paragraph.repetitions.add(repetition);
                }
            }
        }
        
        return paragraph.repetitions;
    }
    
    private static Phrase handlePhrase(List<String> buffer){
        String phrase = "";
        
        for(String line : buffer){
            phrase = phrase.concat(line).concat("\u0020");
        }
        
        return new Phrase(new ArrayList<>(), new ArrayList<>(), phrase);
    }
    
    private static int getDistanceWords(String period, String word) {
        if(period == null || period.isEmpty()){
            return 0;
        }
        
        int firstPosition = 0;
        int lastPosition = 0;
        period = getLineWithoutPunctuations(period);
        String[] periodWords = period.split(" ");
        
        for(int i = 0; i < periodWords.length; i++){
            if(periodWords[i].equals(word)){
                firstPosition = i;
                break;
            }
        }
        
        for(int i = 0; i < periodWords.length; i++){
            if(periodWords[i].equals(word) && (i != firstPosition)){
                lastPosition = i;
                break;
            }
        }
        
        return (firstPosition < lastPosition) ? lastPosition - firstPosition : 0;
    }
    
    private static List<Word> getCountedWords(List<Word> words) {
        List<String> nonRepeatedWords = new ArrayList<>();

        for(Word word : words){
            word.word = getLineWithoutPunctuations(word.word.toLowerCase().trim());
            if(!nonRepeatedWords.contains(word.word)){
                nonRepeatedWords.add(word.word);
            }
        }

        Collections.sort(nonRepeatedWords);
        
        List<Word> response = new ArrayList<>();
        
        for(String word : nonRepeatedWords){
            response.add(new Word(countString(words, word), word));
        }
        
        return response;
    }
    
    private static String getLineWithoutPunctuations(String line){
        line = line.startsWith("–") || line.endsWith("–") || 
               line.startsWith("—") || line.endsWith("—") ? 
                line.replace("-", "")
                    .replace("–", "")
                    .replace("—", "")
                : line;
        line = line.replace(",", "")
                   .replace(".", "")
                   .replace(";", "")
                   .replace(":", "")
                   .replace("(", "")
                   .replace(")", "")
                   .replace("\"", "")
                   .replace("\'", "")
                   .replace("\\", "")
                   .replace("[", "")
                   .replace("]", "")
                   .replace("!", "")
                   .replace("?", "")
                   .replace("/", "")
                   .replace("º", "")
                   .replace("ª", "");
        
        return line;
    }
    
    private static boolean isStopWord(String word){
        return word.equals("e") || word.equals("ou") ||  word.equals("E") ||  word.equals("Ou") ||
               word.equals("o") || word.equals("os") ||  word.equals("O") ||  word.equals("Os") ||
               word.equals("a") || word.equals("as") ||  word.equals("A") ||  word.equals("As") ||
               word.equals("à") || word.equals("às") ||  word.equals("À") ||  word.equals("Às") ||
               word.equals("um") || word.equals("uma") ||  word.equals("uns") ||  word.equals("umas") ||
               word.equals("de")|| word.equals("em") ||  word.equals("De")||  word.equals("Em") ||
               word.equals("no")|| word.equals("na") || word.equals("nos")|| word.equals("nas") || 
               word.equals("No")|| word.equals("Na") || word.equals("Nos")|| word.equals("Nas") || 
               word.equals("do")|| word.equals("da") || word.equals("dos")|| word.equals("das") ||
               word.equals("Do")|| word.equals("Da") || word.equals("Dos")|| word.equals("Das");
    }
    
    private static List<String> readFile(String path, Charset encoding) throws IOException 
    {
        List<String> content = Files.readAllLines(
                Paths.get(System.getProperty("user.dir") + path), 
                encoding);
        
        return content;
    }
    
    private static void startResponse(List<Paragraph> paragraphs, String path) throws IOException{
        FileWriter writer = new FileWriter(path);
        System.out.println();
        
        List<Word> words = new ArrayList<>();
        List<Word> stopWords = new ArrayList<>();
        
        for(Paragraph item : paragraphs){
            for(Phrase phrase : item.phrases){
                words.addAll(getCountedWords(phrase.words));
                stopWords.addAll(getCountedWords(phrase.stopWords));
            }
        }
        
        words = getCountedWords(words);
        stopWords = getCountedWords(stopWords);
        
        for(Paragraph item : paragraphs){
            if(!item.phrases.isEmpty()){
                writeFile(writer, "Parágrafo");
                writeFile(writer, "\nLinha inicial do parágrafo: " + item.firstLine);
                writeFile(writer, "\nNúmero de sentenças: " + item.phrases.size());
                for(Phrase phrase : item.phrases){
                    writeFile(writer, "\n\nSentença");
                    writeFile(writer, "\nNúmero de palavras: " + phrase.words.size());
                    writeFile(writer, "\nNúmero de stop words: " + phrase.stopWords.size());
                }

                writeFile(writer, "\n");

                if(!item.repetitions.isEmpty()){
                    for(Word word : item.repetitions){
                    writeFile(writer, "\nRepetição");
                    writeFile(writer, "\nPalavra: " + word.word + " - Distância: " + word.distance);
                    writeFile(writer, "\n");
                    }
                }
                writeFile(writer, "\n--------------------------------------------------------\n");
            }
        }
        
        writeFile(writer, "\n\n\n");
        for(Word word : words){
            writeFile(writer, "\nPalavra: " + word.word + " | Contador: " + word.counter);
        }

        writeFile(writer, "\n\n\n");
        for(Word word : stopWords){
            writeFile(writer, "\nStop word: " + word.word + " | Contador: " + word.counter);
        }
        
        writer.close();
    }
    
    private static void writeFile(FileWriter writer, String period) throws IOException{
        writer.write(period);
    }
    
    private static int countString(List<Word> list, String item){
        int counter = 0;
        
        for(Word word : list){
            if(word.word.equals(item)){
                counter++;
            }
        }
        
        return counter;
    }
}
