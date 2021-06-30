package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

        System.out.println(in.getString("Please enter the name of the item's department:"));
        System.out.println(in.yesNo());
        System.out.println(in.getInt("Please enter either 1, 2, or 3 into your terminal.", 1, 3));
        System.out.println(in.getInt(1, 10));
        System.out.println(in.getDouble("Please enter individual item price:"));
        System.out.println(in.getDouble(2.5, 10.5));

    }

}
