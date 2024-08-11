import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static int diceNum;
    static int guess;
    static int points;
    public static void main(String[] args) {
        MainMenu();
    }

    private static void MainMenu() {
        System.out.println("What would you like to do today?\nPlay\nExit");
        String userInput = sc.nextLine();

        if(userInput.equalsIgnoreCase("Play")) {
            RollingDice();
            System.out.println("Enter your guess from 1-6");
            guess = sc.nextInt();
            sc.nextLine();

            if(guess == diceNum) {
                points += 10;
                System.out.println("You have " + points +" points");
            }
            else {
                points = 0;
                System.out.println("Nice try! Points have been reset to 0");
            }
            MainMenu();

        } else if(userInput.equalsIgnoreCase("Exit")) {
            System.out.println("You finished with a score of " + points);
            System.out.println("Exiting Game");
            System.exit(0);
        } else {
            System.out.println("Invalid Input");
            MainMenu();
        }
    }

    private static void RollingDice() {
        diceNum = (int)(Math.random()*6) +1;
        System.out.println("The dice has been rolled");
    }
}