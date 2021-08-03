import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
     @Test
        public void givenMessage_WhenSad_ShouldReturnSad() {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD Mood");
            String mood = null;
            try {
                mood = moodAnalyser.analyseMood();
            } catch (MoodAnalyserException e) {
                e.printStackTrace();
            }
            Assertions.assertEquals("SAD", mood);
        }

    }

