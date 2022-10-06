/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textcounter;

/**
 *
 * @author Erick
 */
public class Word implements Comparable{
    public int counter;
    public int distance;
    public String word;

    public Word() {
        this.counter = 0;
        this.distance = 0;
        this.word = " ";
    }

    public Word(int counter, String word) {
        this.counter = counter;
        this.word = word;
        this.distance = 0;
    }
    
    @Override
    public int compareTo(Object o) {
        Word temp = (Word)o;
        if(this.word.equals(temp.word)){
            return 1;
        }
        else{
            return -1;
        }
    }
}
