package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    private Assert Assertions;

    @Test
    public  void givenMessage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public  void givenMessage_WhenNotSad_ShouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assertions.assertEquals("Happy", mood);

    }
}