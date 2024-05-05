import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JungleLevelTest {

    @Test
    public void testOutcome() {


        JungleLevel jungleLevel = new JungleLevel();

        String testInputOne = "2";
        String testInputTwo = "1";

        String actualOutput = JungleLevel.Outcome(testInputOne, testInputTwo);


        String expectedOutput = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + JungleLevel.actressArr[0];


        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWrongInput() {


        JungleLevel jungleLevel = new JungleLevel();

        String testInputOne = "1";
        String testInputTwo = "";

        String actualOutput = JungleLevel.Outcome(testInputOne, testInputTwo);

        // Define the expected output

        String expectedOutput = "The berries were poisonous and you are now experiencing a very painful death.\nNext time, be more careful of what you eat, you have failed this round and must restart!";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }
}