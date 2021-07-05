import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int loopMultiply(int x, int y) {
        int result = 0;
        while (x > 0) {
            result += y;
            x--;
        }
        return result;
    }

    public static int multiplyRecursion(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else {
            if (x == 1) {
                return y;
            } else {
                return x + (multiplyRecursion(x, y - 1));
            }
        }
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Give me a number between %d and %d:\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }

    }

    public static int Factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 10:");
        int userNum = scan.nextInt();
        while (userNum < 1 || userNum > 10) {
            System.out.println("Please enter a number between 1 & 10");
            userNum = scan.nextInt();
        }
        String results = "";
        long fact = 1;
        for (int i = 1; i <= userNum; i++) {
            if (i == 1) {

                System.out.println(i + "! " + " = " + i * fact);
                results = String.valueOf(fact * i);
                fact = fact * i;

            } else {
                results = results + " X " + String.valueOf(i);
                System.out.println(i + "! " + " = " + results + " = " + i * fact);
                fact = fact * i;
            }
        }
        return (int) fact;
        //Still does not prompt the user to continue or not yet

    }

    public static int randomNum(int num){
        int randomInt = (int)(Math.random() * num) + 1;
        return randomInt;
    }

    public static int diceCreator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create some dice!\nHow many sides would you like your die to have?");
        int numOfSides = scanner.nextInt();
        return numOfSides;
    }

    public static int rollTheDice(int num, int num2) {
        Scanner scanny = new Scanner(System.in);
        int numberOfSides = scanny.nextInt();
        String userResponse = "";
        if (num2 == 0) {
            System.out.printf("Would you like to roll your %d sided dice? %n Reply yes to roll! %n", numberOfSides);
            userResponse = scanny.next();
        }
        if (userResponse.equalsIgnoreCase("yes" || num2 == 1)) {
            int die1 = randomNum(numberOfSides);
            int die2 = randomNum(numberOfSides);
            System.out.println("Rolling the dice...");
            System.out.printf("Your dice rolled %d and %d, with a total roll of %d.%n", die1, die2, die1 + die2);
        }
        System.out.println("Would you like to roll the dice again?\nReply yes to roll again or no to quit.");
        userResponse = scanny.next();
        if (userResponse.equalsIgnoreCase("yes")){
            rollTheDice(numberOfSides, 1);
    }




    return num;

}

    public static void main(String[] args) {
        rollTheDice(diceCreator(),0);
        int userInput = getInteger(1, 10);
        System.out.println(Addition(4, 9));
        System.out.println(Subtraction(15, 7));
        System.out.println(multiply(4, 4));
        System.out.println(divide(29, 3));
        System.out.println(modulus(100, 100));
        System.out.println(loopMultiply(3, 4));
        System.out.println(multiplyRecursion(3, 5));
        int userInput = getInteger(20, 30);
        System.out.println(Factorial());
        System.out.println(rollTheDice(30));
    }
}
