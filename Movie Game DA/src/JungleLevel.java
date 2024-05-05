//Level 1

import java.util.Scanner;

public class JungleLevel {

    private static String movieActress; //private string movieActress

    public static void setActress(String newActress) { //setter encapsulation

        movieActress = newActress;
    }

    public static String getActress() { //getter encapsulation

        return movieActress;
    }


    static String messageOutcome = ""; //for testing

    public static String getmessageOutcome(){
        return messageOutcome;
    }

    static String[] actressArr = {"Margot Robbie", "Scarlett Johansson", "Jennifer Lawrence", "Melissa McCarthy", "Meryl Streep", "Viola Davis", "Emma Stone", "Cate Blanchett", "Natalie Portman"};


    String[] optionFood = {"Berries from a bush", "Hunt and cooked birds", "Fish", "Insects and worms"};
    String[] optionSleep = {"Fort built with leaves,sticks and rope", "The floor", "Branches of a tree", "Dont fall asleep"};
    String[] optionHelp = {"Go to nearby water for signs of life", "Smoke signal", "Retrace your steps", "Yell for help"};


    Scanner jungleInput = new Scanner(System.in);
    static String phaseOneInput="";
    static String phaseTwoInput="";
    String phaseThreeInput="";

    String restartInput;




    public void speech() {
        System.out.println("Welcome to Level 1. In this scenario, you have found yourself lost in a jungle inhabited by tigers!\nYour only possessions are a pocket knife, lighter and a rope.\nAnswer the following questions in order to survive. Try not to get eaten!");
        System.out.println();
    }


    void options1() {
        System.out.println("Phase 1: You have been lost for 12 hours and need to find something to eat, what do you do? Pick from 1-4");
        options(optionFood);
        phaseOneInput = jungleInput.nextLine(); //user food option input
    }

    void options2() {
        System.out.println("Phase 2: Nighttime has fallen and you need to find a safe place to sleep, what do you do? Pick from 1-4");
        options(optionSleep);
        phaseTwoInput = jungleInput.nextLine(); //user sleep option input
    }


    void options3() {
        System.out.println("Phase 3: The sun is back and you are becoming delirious from the solitude of the jungle, you decide to get help, what do you do? Pick from 1-4");
        options(optionHelp);
        phaseThreeInput = jungleInput.nextLine(); //user help option input
    }



    public void levelComplete() {
        ZombieLevel zombieLevel = new ZombieLevel(); //instance of the next level

        zombieLevel.startLevel();//start the next level
    }



    public static String Outcome(String foodInput, String sleepInput) {


        if (foodInput.equals("2") && sleepInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[0];
            System.out.println(getmessageOutcome());
            setActress(actressArr[0]); //movie actress set to position in array

        } else if (foodInput.equals("2") && sleepInput.equals("3")) {

            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[1];
            System.out.println(getmessageOutcome());
            setActress(actressArr[1]);

        } else if (foodInput.equals("2") && sleepInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[2];
            System.out.println(getmessageOutcome());
            setActress(actressArr[2]);

        } else if (foodInput.equals("3") && sleepInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[3];
            System.out.println(getmessageOutcome());
            setActress(actressArr[3]);

        } else if (foodInput.equals("3") && sleepInput.equals("3")) {

            messageOutcome= "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[4];
            System.out.println(getmessageOutcome());
            setActress(actressArr[4]);

        } else if (foodInput.equals("3") && sleepInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[5];
            System.out.println(getmessageOutcome());
            setActress(actressArr[5]);

        } else if (foodInput.equals("4") && sleepInput.equals("1")) {
            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[6];
            System.out.println(getmessageOutcome());
            setActress(actressArr[6]);

        } else if (foodInput.equals("4") && sleepInput.equals("3")) {
            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[7];
            System.out.println(getmessageOutcome());
            setActress(actressArr[7]);

        } else if (foodInput.equals("4") && sleepInput.equals("4")) {
            messageOutcome = "Well done, you have completed level 1 and unlocked a new movie characteristic, critically acclaimed actress : " + actressArr[8];
            System.out.println(getmessageOutcome());
            setActress(actressArr[8]);

        } else if (foodInput.equals("1")) {

            messageOutcome = "The berries were poisonous and you are now experiencing a very painful death.\nNext time, be more careful of what you eat, you have failed this round and must restart!";
            System.out.println(getmessageOutcome());

        } else if (sleepInput.equals("2")) {

            messageOutcome = "A pack of tigers found you on the ground and gobbled you up, you have failed this round and must restart.";
            System.out.println(getmessageOutcome());
        }
        return messageOutcome; //for unit tests
    }


    public void errorHandle () {

       do {
            try {

                throw new Exception("Type the letter Y to continue");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            restartInput = jungleInput.nextLine();
        }while (!restartInput.equalsIgnoreCase("Y"));{

        nextLevel();
   }
        }



        public void nextLevel () {
        if (phaseOneInput.equals("1") || phaseTwoInput.equals("2")) {
            System.out.println();
            startLevel();//restarts the level to try again
        } else {
            levelComplete(); //goes to the next level

        }
    }


    public void startLevel() {//calling the methods to invoke them, starts new level
        speech();
        options1();
        options2();
        options3();
        Outcome(phaseOneInput, phaseTwoInput);
      errorHandle();
        nextLevel();
    }


        public static void options (String[]arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println((i + 1) + ": " + arr[i]);
            }
        }



}

