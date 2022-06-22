package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyzer {
    @Test
    public void givenMessage_whenAnalyze_thenRespondSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAnalyze_thenRespondHAPPY(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
