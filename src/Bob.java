import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean otraVes = true;
        do {
            System.out.println("You can try to ask Bob a question if you'd like...");
            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")){
                otraVes = true;
                System.out.println("sure");
            } else if (userInput.endsWith("!")){
                otraVes = true;
                System.out.println("Whoa, chill out");
            } else if (userInput.equals("") || userInput.equals(" ")){
                otraVes = true;
                System.out.println("Fine, be that way!");
            } else if (userInput.equals("Fine")) {
                otraVes = false;
            } else {
                otraVes = true;
                System.out.println("whatever");
            }
        } while (otraVes);
    }
}
