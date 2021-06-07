package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        super(length, width);


    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;

    }
}
