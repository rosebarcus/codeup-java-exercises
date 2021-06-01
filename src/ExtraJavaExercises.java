import java.util.Scanner;

public class ExtraJavaExercises {
    public static void main(String[] args) {

            int i,n=0,s=0;
            double avg;
            {

                System.out.println("Input 10 numbers : ");

            }
            for (i=0;i<10;i++)
            {
                Scanner in = new Scanner(System.in);

                n = in.nextInt();

                s +=n;
            }
            avg=s/10;
            System.out.println("The sum of 10 no is : " +s+"\nThe Average is : " +avg);

        }
}
