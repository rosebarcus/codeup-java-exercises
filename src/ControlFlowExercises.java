import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        String userChoice = "y";
        while(!userChoice.equals("n")){
            System.out.println("Enter the student's numerical grade: ");
            byte grade = scanner1.nextByte();
            char letterGrade;
            if (grade >= 0 && grade <= 59){
                letterGrade = 'F';
            } else if (grade > 59 && grade <= 66){
                letterGrade = 'D';
            } else if (grade >66 && grade <= 79) {
                letterGrade = 'C';
            } else if (grade > 79 && grade <= 87){
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade? (y/n");
        }

    }
}
