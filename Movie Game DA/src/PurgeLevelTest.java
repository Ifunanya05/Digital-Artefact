import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PurgeLevelTest {

    @Test
    public void testOutcome() {

        String testInputOne = "2";
        String testInputTwo = "4";

        String actualOutput = PurgeLevel.Outcome(testInputOne, testInputTwo);

        String expectedOutput = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + PurgeLevel.genreArr[5];


        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    public void testWrongInput() {


        String testInputOne = "4";
        String testInputTwo = "";

        String actualOutput = PurgeLevel.Outcome(testInputOne, testInputTwo);

        String expectedOutput = "Except for getting someone's clothes dirty, you were unable to protect yourself and did not survive the purge. You have failed this round and must restart.";

        assertEquals(expectedOutput, actualOutput);
    }
}