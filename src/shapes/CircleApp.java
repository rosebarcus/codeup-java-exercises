package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of said circle?");
        //Need to instantiate a new input object:
        Input in = new Input();

        // longer, more explicit way.
        double userRadius = in.getDouble("Please enter individual item price:");
        // then plug this variable into the constructor to instantiate a new Circle object.
        // Circle c = new circle(userRadius);

        Circle c = new Circle((in.getDouble("Please enter individual item price:")));

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
