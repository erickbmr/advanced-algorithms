package com.mycompany.textcounter;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    public List<Phrase> phrases;
    public List<Word> repetitions;
    public String period;
    public int firstLine;
    
    public Paragraph(){
        this.phrases = new ArrayList<>();
        this.repetitions = new ArrayList<>();
        this.period = "";
        this.firstLine = 0;
    }
    
    public Paragraph(List<Phrase> phs, int fLine){
        this.phrases = phs;
        this.repetitions = new ArrayList<>();
        this.firstLine = fLine;
        this.period = "";
    }
}
