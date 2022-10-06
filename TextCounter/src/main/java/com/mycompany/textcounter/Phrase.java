/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textcounter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Phrase {
    public String period;
    public List<Word> words;
    public List<Word> stopWords;

    public Phrase() {
        this.stopWords = new ArrayList<>();
        this.words = new ArrayList<>();
        this.period = "";
    }

    public Phrase(List<Word> words, List<Word> stopWords, String period) {
        this.period = period;
        this.words = words;
        this.stopWords = stopWords;
    }
    
    
}
