package com.example.alanmclarney.word_counter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class WordCounterTest {


    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("test test test");
    }

    @Test
    public void hasSentence(){
        assertEquals("test test test", wordCounter.getAllWords());
    }

    @Test
    public void sentenceHasLength(){
        assertEquals(3, wordCounter.getNumberOfWords());
    }




}
