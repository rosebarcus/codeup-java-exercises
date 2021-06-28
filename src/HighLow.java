/*
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        myGame();

    }

    public static int randomNum(int min, int max) {
        return (int) Math.floor(Math.random() * (max) - min + min);
    }

    public static String guessingGame(int userGuess, int answer) {
        if (userGuess > answer) {
            return "LOWER";
        } else if (userGuess < answer) {
            return "HIGHER";
        } else {
            return "YOU GOT IT!";
        }
    }

    public static void guessingGame (int min, int max, int userAttempts){
        Scanner sc = new Scanner(System.in);
        int answer = randomNum(min, max);
        int guess = 0;
        int attempts = 0;
        while (guess != answer && attempts < userAttempts) {
            System.out.printf("Guess a number between %d and %d, you have %d attempts left.%n", min, max,
                    userAttempts-attempts);
            guess = sc.nextInt();
            System.out.println(guessingGame(guess, answer));
            attempts++;
        }
        if (attempts == userAttempts && guess != answer){
            System.out.println("Sorry, the number was: " + answer + "You have run out of guesses...");
        } else {
            System.out.println("Thanks for playing! You took " + attempts + " attempts.");
        }

    }
}
*/
