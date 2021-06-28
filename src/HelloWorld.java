import org.w3c.dom.ls.LSOutput;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(", World!");

        int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString = "Hello, this is my String.";
        /*char myString = "Hello, this is my String.";*/
        System.out.println(myString);

        float myNumber = 123;
        System.out.println(myNumber);
        int myNumberChanged = (int)myNumber;
        //OR = (float) 3.14;
        /* that's one way to fix the above issue, not sure of the second */
        System.out.println(myNumberChanged);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

     /*   int x = 5;*/
        System.out.println(++x);
        System.out.println(x);

        /*The above codeblocks use post decrement and pre decrement, I'm not sure exactly why they yield the same
        result*/

        /*var class = */

        /*cannot resolve symbol 'var'*/

      /*  String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;*/

        /*String cannot be cast to a class*/

       /* int three = (int) "three";*/

        /*incompatible variable types*/

       /* int x = 4 + 5;
        System.out.println(x);

        int x = 3 + y = 4;
*/


/*TODO please take a break and come back to review this entire exercise after rereading the curriculum*/








    }
}

