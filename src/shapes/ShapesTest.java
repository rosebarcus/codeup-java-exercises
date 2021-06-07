package shapes;

public class ShapesTest {
    public static void main(String[] args) {

       /*Measurable myShape = new Rectangle(4, 5);*/

       Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Quadrilateral theirShape = new Rectangle(3, 4);

        System.out.println(theirShape.getLength());
        System.out.println(theirShape.getWidth());
    }
}
