import java.util.Scanner;

public class ConsoleExercises {
    public ConsoleExercises() {
    }

    public static void main(String[] args) {

        double pi = 3.14159F;
// System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.printf("% .2f", pi);

        System.out.println("Give me a number.");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        System.out.printf("Your number is: %d%n", userNum);

        System.out.println("Can you give me a word");
        String firstWord = scanner.next();
        System.out.println("Another one!");
        String secondWord = scanner.next();
        System.out.println("Last and third word!");
        String thirdWord = scanner.next();

        System.out.printf("Your three words were: \"%s\", \"%s\", and \"%s\".%n", firstWord, secondWord, thirdWord);

        System.out.println("Give me a sentence!");
        scanner.nextLine();
        String sentence = scanner.next();
        System.out.printf("You entered: \"%s\"", sentence);

        System.out.println("Can you tell me the length of a room at Codeup in meters?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nGive me a width in meters: %n", length);
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("Length entered: %d meters. %dWidth entered: %d meters. %n Area of room %nArea of room: %d " +
                "meters squared. %nPerimeter of room: %d meters.%n", length, width, area, perimeter);





    }
}

