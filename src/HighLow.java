import java.util.Scanner;
// Karen helped you fix this game
public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static int randomNum(int min, int max) {
        return (int) Math.floor(Math.random() * ((max) - min) + min);
    }

    public static String guessingGame(int guess, int answer) {
        if (guess > answer) {
            return "LOWER";
        } else if (guess < answer) {
            return "HIGHER";
        } else {
            return "YOU GOT IT!";
        }
    }

    public static void guessingGame(int min, int max, int tries) {
        Scanner sc = new Scanner(System.in);
        int answer = randomNum(min, max);
        int guess = 0;
        int attempts = 0;
        while (guess != answer && attempts < tries) {
            System.out.printf("Guess a number between %d and %d You have %d attempts left.%n", min, max, tries - attempts);
            guess = sc.nextInt();
            System.out.println(guessingGame(guess, answer));
            attempts++;
        }
        if (attempts == tries && guess != answer) {
            System.out.println("The random number was: " + answer + ". You have no remaining guesses.");
        } else {
            System.out.println("That was fun, thanks for playing! It took you " + attempts + " attempts.");
        }
    }

    public static void guessingGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to HighLow!");
        System.out.println("Please enter a minimum value.");
        int min = MethodsExercises.getInteger(0, 300);
        System.out.printf("You entered: %d.%n", min);
        System.out.println("Please enter a maximum value.");
        int max = MethodsExercises.getInteger(min + 1, min + 300);
        System.out.printf("You entered: %d.%n", max);
        int tries = 25;
        while (true) {
            System.out.println("Please select a difficulty level:");
            System.out.println("EASY: 25 tries to guess the right number.");
            System.out.println("NORMAL: 15 tries to guess the right number.");
            System.out.println("HARD: 5 tries to guess the correct number.");
            System.out.println("HOT SHOT: 1 try to guess the correct number.");
            String difficulty = sc.nextLine();
            if (difficulty.equalsIgnoreCase("easy")) {
                System.out.println("You've selected: EASY");
                break;
            } else if (difficulty.equalsIgnoreCase("normal") || difficulty.equalsIgnoreCase("medium")) {
                System.out.println("You've selected: NORMAL");
                tries -= 10;
                break;
            } else if (difficulty.equalsIgnoreCase("hard")) {
                System.out.println("You've selected: HARD");
                tries -= 20;
                break;
            } else if (difficulty.equalsIgnoreCase("hot shot")) {
                System.out.println("You've selected: HOT SHOT");
                tries -= 24;
                break;
            } else {
                System.out.println("Invalid selection: Try Again.");
            }
        }
        guessingGame(min, max, tries);
        String answer;
        System.out.println("Would you like to play again?");
        answer = sc.nextLine();
        while (!answer.equalsIgnoreCase("No") && !answer.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter valid answer.");
            System.out.println("Play again?");
            answer = sc.nextLine();
        }
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("Awesome!");
            guessingGame();
        } else {
            System.out.println("See you next time!");
        }
    }
}
