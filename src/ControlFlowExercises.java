import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("______ | _______ | _____");
        for(int i = 1; i <= userInput; i++){
            System.out.printf("%-7d| %-8d| %-5d%n ", i, i * i, i * i * i);
        }

    }
}
