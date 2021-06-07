package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        // adds the given grade to the grades property
        return this.name;
    }

    public void addGrade(int grade) {
        // returns the average of the students grades
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student Marsha = new Student("Marsha");
        Marsha.addGrade(97);
        Marsha.addGrade(100);
        Marsha.addGrade(70);
        System.out.println("Marsha.getGradeAverage() = " + Marsha.getGradeAverage());

    }
}
