//Level 4

import java.util.Scanner;

public class PurgeLevel extends JungleLevel {

    static String[] genreArr = {"Comedy", "Horror", "Romance", "Action", "History", "Drama", "Psychological thriller", "Science fiction", "Crime"};

    String[] optionSafety = {"An underground bunker","Security cameras","Boarded windows", "Booby trap"};
    String [] optionWeapon ={"Crossbow", "Baseball bat", "Chainsaw", "Paintball gun"};
    String [] optionBurglar = {"Call 999", "Confront them", "Escape your house from the backdoor","Hide and wait until they leave"};

    Scanner purgeInput = new Scanner(System.in);

    Movie movie = new Movie();


    private static String movieGenre; //private string movieGenre

    public static void setGenre(String genre) { //setter encapsulation

        movieGenre = genre;
    }


    public static String getGenre() { //getter encapsulation

        return movieGenre;
    }



    public void speech() {
        System.out.println("Congratulations, you have finally made it to level 4.\nIn this scenario,you are in the purge, a night,where all crime, including murder, is temporarily legal.\nDo what you must to survive.");
        System.out.println();
    }

    public void options1() {
        System.out.println("Phase 1: What safety precaution do you have installed in your home? Pick 1-4");
        options(optionSafety);
        phaseOneInput = purgeInput.nextLine();
    }


    public void options2() {
        System.out.println("Phase 2: What is your weapon of choice? Pick 1-4");
        options(optionWeapon);
        phaseTwoInput = purgeInput.nextLine();
    }



    public void options3() {
        System.out.println("Phase 3: You hear someone break into your home, what do you do? Pick 1-4");
        options(optionBurglar);
        phaseThreeInput = purgeInput.nextLine();
    }

//4, 1
public static String Outcome(String weaponInput, String burglarInput) {


    if (weaponInput.equals("1") && burglarInput.equals("2")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[0];
        setGenre(genreArr[0]);
        System.out.println(getmessageOutcome());

    } else if (weaponInput.equals("1") && burglarInput.equals("3")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[1];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[1]);

    } else if (weaponInput.equals("1") && burglarInput.equals("4")) {


        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[2];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[2]);

    } else if (weaponInput.equals("2") && burglarInput.equals("2")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[3];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[3]);

    } else if (weaponInput.equals("2") && burglarInput.equals("3")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[4];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[4]);

    } else if (weaponInput.equals("2") && burglarInput.equals("4")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[5];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[5]);

    } else if (weaponInput.equals("3") && burglarInput.equals("2")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[6];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[6]);

    } else if (weaponInput.equals("3") && burglarInput.equals("3")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[7];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[7]);

    } else if (weaponInput.equals("3") && burglarInput.equals("4")) {

        messageOutcome = "Well done, you have completed level 4 and unlocked a new movie characteristic, the genre: " + genreArr[8];
        System.out.println(getmessageOutcome());
        setGenre(genreArr[8]);

    } else if (weaponInput.equals("4")) {

        messageOutcome = "Except for getting someone's clothes dirty, you were unable to protect yourself and did not survive the purge. You have failed this round and must restart.";
        System.out.println(getmessageOutcome());

    } else if (burglarInput.equals("1")) {

        messageOutcome = "It's the purge and the police are unavailable, you did not get away in time and have failed this round and must restart!.";
        System.out.println(getmessageOutcome());
    }
    return messageOutcome;
}


    public void startLevel() { //calling the methods to invoke them, starts new level
        speech();
        options1();
        options2();
        options3();
        Outcome(phaseTwoInput, phaseThreeInput);
        errorHandle();
        nextLevel();
    }



    public void nextLevel() {
        if (phaseTwoInput.equals("4") || phaseThreeInput.equals("1") ) {
            System.out.println();
            startLevel();
        } else {
            movie.movieOutcome();
        }

    }





}


