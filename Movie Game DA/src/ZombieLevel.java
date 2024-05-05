//Level 2

import java.util.Scanner;

public class ZombieLevel extends JungleLevel {

    static String[] actorArr = {"Robert Downey Jr", "Leonardo Dicaprio", "Tom Hanks", "Adam Sandler", "Timothee Chalamet", "Tom Cruise", "Christian Bale", "Brad Pitt", "Samuel L Jackson"};

    String[] optionResource = {"First-aid kit", "Weapons", "Tinned Food", "Soap"};
    String [] optionHideout ={"Abandoned church", "A farm", "Old office building", "An empty caravan"};
    String [] optionEvacuation = {"USA","Kenya", "Iceland","Australia"};

    Scanner zombieInput = new Scanner(System.in);

    static String phaseOneInput;
    static String phaseTwoInput;
    static String phaseThreeInput;

    private static String movieActor; //private string movieActor


    public static void setActor(String actor) { //setter encapsulation

        movieActor = actor;
    }

    public static String getActor() { //getter encapsulation

        return movieActor;
    }



    public void speech(){
        System.out.println("You have successfully made it to level 2.\nIn this scenario, a zombie invasion has broke out and you must do everything you can to ensure your survival.\nHint:Zombies love the smell of human flesh and hate the sun");
        System.out.println();
    }


    public void options1() {
        System.out.println("Phase 1: You have arrived at an abandoned supermarket,what resources are you going to collect? Pick 1 - 4");
        options(optionResource);
        phaseOneInput = zombieInput.nextLine();
    }


    public void options2(){

        System.out.println("Phase 2: A hideout is required for survival, which are you choosing? Pick 1 - 4");
        options(optionHideout);
        phaseTwoInput= zombieInput.nextLine();

    }


    public void options3(){
        System.out.println("Phase 3: The government announces they are aiding in the migration of citizens to safe zones outside of the UK.\nYou have 4 countries to pick from, where do you choose? Pick 1 - 4");
        options(optionEvacuation);
        phaseThreeInput = zombieInput.nextLine();

    }



    public void levelComplete() {
        AlienLevel alienLevel = new AlienLevel(); //instance of the next level
        alienLevel.startLevel(); //start the next level
    }



    public static String Outcome(String resourceInput, String evacInput){

        if (resourceInput.equals("1") && evacInput.equals("1")){

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[0];
            System.out.println(getmessageOutcome());
            setActor(actorArr[0]); //actor set to position in array


        } else if (resourceInput.equals("1") && evacInput.equals("2")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[1];
            System.out.println(getmessageOutcome());
            setActor(actorArr[1]);


        } else if (resourceInput.equals("1") && evacInput.equals("4")){

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[2];
            System.out.println(getmessageOutcome());
            setActor(actorArr[2]);


        } else if (resourceInput.equals("2") && evacInput.equals("1")){

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[3];
            System.out.println(getmessageOutcome());
            setActor(actorArr[3]);


        } else if (resourceInput.equals("2") && evacInput.equals("2")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[4];
            System.out.println(getmessageOutcome());
            setActor(actorArr[4]);


        } else if (resourceInput.equals("2") && evacInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[5];
            System.out.println(getmessageOutcome());
            setActor(actorArr[5]);

        } else if (resourceInput.equals("3") && evacInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[6];
            System.out.println(getmessageOutcome());
            setActor(actorArr[6]);


        }else if (resourceInput.equals("3") && evacInput.equals("2")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actor : " + actorArr[7];
            System.out.println(getmessageOutcome());
           setActor(actorArr[7]);



        }else if (resourceInput.equals("3") && evacInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 2 and unlocked a new movie characteristic, critically acclaimed actress : " + actorArr[8];
            System.out.println(getmessageOutcome());
            setActor(actorArr[8]);

        //wrong input
        } else if (resourceInput.equals("4")) {
            messageOutcome = "By using soap, you have made the zombies more attracted to your human scent,making your less likely to survive.\nYou have failed this round and must restart.";
            System.out.println(getmessageOutcome());

        } else if (evacInput.equals("3")) {
            messageOutcome ="A zombie would thrive in the cold of Iceland, making you less likely to survive, you have failed this round and must restart.";
            System.out.println(getmessageOutcome());

        }
        return messageOutcome;

    }

    public void startLevel() {//calling the methods to invoke them, starts new level
        speech();
        options1();
        options2();
        options3();
        Outcome(phaseOneInput, phaseThreeInput);
        errorHandle();
        nextLevel();
    }




    public void nextLevel () {
        if (phaseOneInput.equals("4") || phaseThreeInput.equals("3") ) {
            System.out.println();
            startLevel();
        } else {
            levelComplete();
        }
    }

    }

