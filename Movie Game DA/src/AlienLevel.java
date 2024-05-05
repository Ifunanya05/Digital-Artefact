//Level 3

import java.util.Scanner;



public class AlienLevel extends JungleLevel {
    static String[] directorArr = {"Quentin Tarantino", "Martin Scorsese", "Greta Gerwig", "Wes Anderson", "Steven Spielberg", "Alfred Hitchcock", "Bong Joon-Ho", "Paul Thomas Anderson", "Denis Villenueve"};

    String[] optionInvention = {"Phones","Pizza", "Aeroplanes", "Vaccines"};
    String [] optionPlanet ={"Jupiter" ,"Saturn", "Mercury","Mars"};
    String [] optionPlan = {"Place a bomb under their spacecraft", "Offer them cake as a gesture of goodwill","Threaten them with war", "Sneeze on them"};

    Scanner alienInput = new Scanner(System.in);
   


    private static String movieDirector; //private string movieDirector


    public static void setDirector(String director) { //setter encapsulation

        movieDirector = director;
    }


    public static String getDirector() { //getter encapsulation

        return movieDirector;
    }


    public void speech(){
        System.out.println("Well done on making it to level 3. In this scenario, you are the prime minister of England and must prevent aliens from invading Earth.\nHint: These specific aliens have been part of an intergalactic war against Martians for a millennium");
        System.out.println();
    }


    public void options1() {
        System.out.println("Phase 1: The aliens want to know what's the greatest invention of man? Choose wisely. Pick 1-4");
        options(optionInvention);
        phaseOneInput = alienInput.nextLine();
    }


    public void options2(){
        System.out.println("Phase 2: For some reason, these aliens really want to know, what is your favourite planet in our Solar System? Pick 1-4");
        options(optionPlanet);
        phaseTwoInput = alienInput.nextLine();
    }


    public void options3(){
        System.out.println("Phase 3: Whilst the aliens are preoccupied, you devise a plan to get rid of them, which is the best? Pick 1 - 4");
        options(optionPlan);
        phaseThreeInput = alienInput.nextLine();
    }




    public void levelComplete() {
        PurgeLevel purgeLevel = new PurgeLevel();

        purgeLevel.startLevel();
    }



    public static String Outcome(String planetInput, String planInput) {

        if (planetInput.equals("1") && planInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, critically acclaimed director : " + directorArr[0];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[0]);

        } else if (planetInput.equals("1") && planInput.equals("2")) {


            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[1];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[1]);

        } else if (planetInput.equals("1") && planInput.equals("4")) {


            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[2];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[2]);

        } else if (planetInput.equals("2") && planInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[3];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[3]);


        } else if (planetInput.equals("2") && planInput.equals("2")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[4];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[4]);

        } else if (planetInput.equals("2") && planInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[5];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[5]);

        } else if (planetInput.equals("3") && planInput.equals("1")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[6];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[6]);

        } else if (planetInput.equals("3") && planInput.equals("2")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[7];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[7]);

        } else if (planetInput.equals("3") && planInput.equals("4")) {

            messageOutcome = "Well done, you have completed level 3 and unlocked a new movie characteristic, director : " + directorArr[8];
            System.out.println(getmessageOutcome());
            setDirector(directorArr[8]);

        } else if (planetInput.equals("4")) {

           messageOutcome = "These aliens have been in an ongoing war with Mars for a millennium and suspect you are allies.\nThey swiftly take over Earth and make humans their slaves - you have failed this round and must restart!";
            System.out.println(getmessageOutcome());

        } else if (planInput.equals("3")) {

            messageOutcome = "These aliens gladly accept your proposition of war. With their advanced weaponry, they soon take over Earth and make humans their slaves - you have failed this round and must restart!";
            System.out.println(getmessageOutcome());
        }
        return messageOutcome;
    }


    public void startLevel() {//calling the methods to invoke them, starts new level
        speech();
        options1();
        options2();
        options3();
        Outcome(phaseTwoInput, phaseThreeInput);
        errorHandle();
        nextLevel();
    }



    public void nextLevel () {
            if (phaseTwoInput.equals("4") || phaseThreeInput.equals("3") ) {
                System.out.println();
                startLevel();
            } else {
                levelComplete();
            }

    }


}


