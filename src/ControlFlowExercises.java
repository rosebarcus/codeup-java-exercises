import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
       ///*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
        //program Starts:
        //Please enter pin:
        //22132
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //23412
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //12345
        //Output:
        //Correct, welcome back.
        // */

        Scanner scanner1 = new Scanner(System.in);
        final int PIN = 52621;
        int userInput = 0;
        int attempts = 1;
        while (attempts <= 3){
            System.out.println("Please enter pin: ");
            userInput = scanner1.nextInt();
            if (userInput != PIN){
                if(attempts < 3){
                    System.out.println("Incorrect, try again");
                }else {
                    System.out.println("Sorry, you have been locked out.");
                }
            } else {
                System.out.println("Correct, welcome back");
                break;
            }
        }

    }
}
