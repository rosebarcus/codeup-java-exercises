import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        /*Statements, decisions and loops can solve all problems*/
      /*  int x = 5;
        if (x == 5) {

            System.out.println("If you are reading this, it means x is five");
        }

        System.out.println("On the other hand, this says nothing about x, because it runs regardless of what x is");*/

       /* int y = 2;
        y = 3;
        if (y==2) {
            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y==2' is " +
                    "true.");
        } else {
            System.out.println("I have tested to see if 'y == 2' is true, and it's not. It is false.");*/
  /*    short y = -5;
      y = 12;
      y = 32000;
     // y = 33000; can't put an int into a short!
      if (y <0) {
          System.out.println("The variable y contains a negative number value");

        } else if (y >=0 && y < 30000) {
          System.out.println("The variable y contains a positive variable value");
      } else {
          System.out.println("The variable y contains a numeric value that is dangerously close to the max value for " +
                  "short type variables, which is " + Short.MAX_VALUE);
      }*/
   /* String customerChoice;
      customerChoice = "caramel pistachio mocha";
      switch (customerChoice) {
          case "vanilla":
              System.out.println("One vanilla coming right up!");
              break;
          case "chocolate":
                  System.out.println("Chocolate coming right up!");
                  break;
          case "strawberry":
              System.out.println("Strawberry coming right up!");
              break;
          default:
              System.out.println("We don't have that, go away!");
              break;
      }*/

        /*Cannot do the following*/

       /* int customerMaxBudget = 10;
        switch (customerMaxBudget){
            case(>=0 && <=1000){
                System.out.println("Would you prefer a place for more limited budgets?");
            }
        }*/

        /*----------------------Logical Operators-------------------*/

        // you can do && || &

       /* int c= 0, d = 100, e = 50;
        // short circuit operator
        if (c == 1 && e++ < 100) {
            // do anything
        }
        System.out.println("e = " + e);

        if (c == 0 && e++ <100) {
            // do anything
            d = 150;
        }
        System.out.println("e = " + e);
        // non short circuit operator
        if (c == 1 & e++ < 100) {
            //anything goes
        }
        System.out.println("e = " + e);*/

       /* boolean existence = true;
        boolean solipsism = false;
        boolean weAllLiveInSomeoneElsesDream = false;
        boolean thisDeskISRealNotAProjectionOfMyMind = true;

        if (solipsism || thisDeskISRealNotAProjectionOfMyMind) {
            System.out.println("Common sense is victorious");
        } else {
            sol
        }*/

        String myName = "Rose";
        String anotherRose = "Rose";
        String rose = new String("Rose");

      /*  System.out.println(myName == anotherRose);
        System.out.println(myName == rose);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userInput = scanner.next();
       /* if (userInput == myName) {
            System.out.println("Hello, me!");
        } else {
            System.out.println("You are not me!");
        }*/

        if(userInput.equals(myName)){
            System.out.println("Hello, me!");
        } else {
            System.out.println("You are not me");
        }

        /*-----------------------------Let's get loopy--------------------------------*/

        int i = 15427;
        while( i < 10){
            System.out.println("Now I'm in the loop. I has not incremented yet and its value is" + i);
            //i++ is shorthand for i = i + 1;
            i++;
            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
        }
        System.out.println("This is outside the loop, after it has executed. The conditional has tested false. The " +
                "value of i is now " + i);

        do {
            System.out.println("Now I'm in the loop. I has not incremented yet and its value is" + i);
            //i++ is shorthand for i = i + 1;
            i++;
            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
        } while (i <10);
        System.out.println("This is outside the loop, after it has executed. The conditional has tested false. The " +
                "value of i is now " + i);

    }
}
