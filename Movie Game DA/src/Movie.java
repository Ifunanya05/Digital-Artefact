import java.util.Scanner;

public class Movie {

   static Scanner finalInput = new Scanner(System.in);
   static String lastInput;

   static ZombieLevel zombieLevel = new ZombieLevel();
   static JungleLevel jungleLevel = new JungleLevel();
  static  AlienLevel alienLevel = new AlienLevel();
  static PurgeLevel purgeLevel = new PurgeLevel();
static Main main = new Main();


   public static void finalSpeech() {
      System.out.println("Congratulations!\nYou have successfully survived in the jungle, managed to not turn into a zombie, \nprevented an alien invasion and lived to tell the tale of the purge.\n\nAs a reward for your formidable survival instincts, you have been gifted 4 movie traits.\n\nThe talented actress: " + jungleLevel.getActress() +" and the brilliant actor: " + zombieLevel.getActor() + "\nThe inspiring director: "+ alienLevel.getDirector() + " and the gripping genre: " + purgeLevel.getGenre());

      System.out.println(); //skip line
   }



   public static void finalOutcome() {
      if (ZombieLevel.getActor().equals("Robert Downey Jr")) {
         System.out.println("Based on your outcomes, the next movie you should watch should be Oppenheimer");

      } else if (ZombieLevel.getActor().equals("Leonardo Dicaprio")) {
         System.out.println("Based on your outcomes, the next movie you should should be Catch Me If You Can");
      } else if (ZombieLevel.getActor().equals("Tom Hanks")) {
         System.out.println("Based on your outcomes, the next movie you should should be Elvis");
      } else if (ZombieLevel.getActor().equals("Adam Sandler")) {
         System.out.println("Based on your outcomes, the next movie you should should be Uncut Gems");

      } else if (ZombieLevel.getActor().equals("Timothee Chalamet")) {
         System.out.println("Based on your outcomes, the next movie you should should be Beautiful Boy");

      } else if (ZombieLevel.getActor().equals("Tom Cruise")) {
         System.out.println("Based on your outcomes, the next movie you should should be Interview with a Vampire");

      } else if (ZombieLevel.getActor().equals("Christian Bale")) {
         System.out.println("Based on your outcomes, the next movie you should should be American Hustle");
      } else if (ZombieLevel.getActor().equals("Brad Pitt")) {
         System.out.println("Based on your outcomes, the next movie you should should be Babylon");
      } else if (ZombieLevel.getActor().equals("Samuel L Jackson")) {
         System.out.println("Based on your outcomes, the next movie you should should be Django Unchained");
      }
      else {
         gameOver();
      }
   }


   public static void gameOver() {
       do {
           try {

               throw new Exception("Type the letter X to continue");

           } catch (Exception e) {
               System.out.println("Enjoy watching your new film! Press X to restart");
           }
           lastInput = finalInput.nextLine();
       }while (!lastInput.equalsIgnoreCase("X"));

           Main.begin();

      }

      public static void movieOutcome() {
        finalSpeech();
        finalOutcome();
        gameOver();
    }
   };