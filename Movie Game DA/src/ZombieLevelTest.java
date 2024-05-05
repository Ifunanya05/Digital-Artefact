import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZombieLevelTest {

    @Test
    public void testOutcome() {


        ZombieLevel zombieLevel = new ZombieLevel();

        String testInputOne = "3";
        String testInputTwo = "2";

        String actualOutput = ZombieLevel.Outcome(testInputOne, testInputTwo);


        String expectedOutput = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + ZombieLevel.actorArr[7];


        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWrongInput() {


    ZombieLevel zombieLevel = new ZombieLevel();

        String testInputOne = "";
        String testInputTwo = "3";

        String actualOutput = ZombieLevel.Outcome(testInputOne, testInputTwo);

        // Define the expected output

        String expectedOutput = "A zombie would thrive in the cold of Iceland, making you less likely to survive, you have failed this round and must restart.";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);
    }
}