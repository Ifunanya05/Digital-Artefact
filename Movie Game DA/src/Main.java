

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void greet() {
        System.out.println("Welcome to a mini game to determine the next movie you should watch!\nThere are four levels of scenarios that await, each unlocking a unique movie trait.\nBeware, a misstep could reset your progress. Good luck on your journey");
        System.out.println();
    }
    public static void begin() {

        greet();
        startGame();
    }
    public static void startGame() {
        JungleLevel jungleLevel = new JungleLevel(); //instance of class
        jungleLevel.startLevel();
    }
    public static void main(String[] args) {



        begin();





        }
    }


