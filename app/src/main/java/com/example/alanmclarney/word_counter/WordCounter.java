package com.example.alanmclarney.word_counter;

/**
 * Created by alanmclarney on 08/08/2017.
 */

public class WordCounter {

   private String allWords;


    public WordCounter(String allWords){
        this.allWords = allWords;
    }


    public String getAllWords() {
        return allWords;
    }

    public void setAllWords(String allWords) {
        this.allWords = allWords;
    }

    public int getNumberOfWords(){
       String[] result = allWords.trim().split("\\s+");
        return result.length;
    }
}
