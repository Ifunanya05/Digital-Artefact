import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlienLevelTest {

    @Test
    public void testOutcome() {

        String testInputOne = "2";
        String testInputTwo = "2";

        String actualOutput = AlienLevel.Outcome(testInputOne, testInputTwo);

        String expectedOutput = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + AlienLevel.directorArr[4];


        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    public void testWrongInput() {


        String testInputOne = "4";
        String testInputTwo = "";

        String actualOutput = AlienLevel.Outcome(testInputOne, testInputTwo);

        String expectedOutput = "These aliens have been in an ongoing war with Mars for a millennium and suspect you are allies.\nThey swiftly take over Earth and make humans their slaves - you have failed this round and must restart!";

        assertEquals(expectedOutput, actualOutput);
    }
}