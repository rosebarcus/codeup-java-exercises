package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {

    public static Scanner sc = new Scanner(System.in);

    public static boolean beginning = true;

    public static void gitUserInfo(HashMap<String, Student> map){
        if(beginning){
            System.out.println("Welcome! \n");
            System.out.println("Here are the GitHub usernames of our students: \n");
            for(String name : map.keySet()){
                System.out.println(("|" + name + "|"));
            }
            /*System.out.println("\n");*/
        }
        System.out.println("What student would you like information on?\n");
        String userSelection = sc.nextLine();
        if(map.containsKey((userSelection))){
            System.out.printf("Name %s - GithHub username: %s%n", map.get(userSelection).getName(), userSelection);
            System.out.printf("Current Average Grade %.1f",
                    map.get(userSelection).getGradeAverage());
        } else {
            System.out.println("Sorry, no student with the GitHub username of " + "\"" +userSelection + "\".");
        }
        System.out.println("Would you like to see another student? y/n?");
        userSelection = sc.nextLine();
        if(userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes")){
            beginning = false;
            gitUserInfo(map);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
       /* Set<String> keySet = students.keySet();
        ArrayList<String> listOfKeys = new ArrayList<>(keySet);*/

        Student student1 = new Student("Rose");
        student1.addGrade(89);
        student1.addGrade(95);
        student1.addGrade(88);
        students.put("rosebarcus89", student1);

        Student student2 = new Student("Dru");
        student2.addGrade(99);
        student2.addGrade(79);
        student2.addGrade(98);
        students.put("drubie", student2);

        Student student3 = new Student("Lauren");
        student3.addGrade(100);
        student3.addGrade(87);
        student3.addGrade(90);
        students.put("LOSNOW", student3);

        Student student4 = new Student("Fran");
        student4.addGrade(96);
        student4.addGrade(85);
        student4.addGrade(69);
        students.put("frankithe", student4);
        gitUserInfo(students);



    }
}
