package org.example;
public class MoodAnalyserException extends Exception
{
    public MoodAnalyserException(String mood_is_not_sad, String message)
    {
        super(message);
    }
}