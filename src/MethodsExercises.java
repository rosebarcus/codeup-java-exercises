public class MethodsExercises {

    public static int Addition(int num1, int num2){
        return num1 + num2;
    }

    public static int Subtraction (int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int loopMultiply(int x, int y){
        int result = 0;
        while(x > 0){
            result += y;
            x--;
        }
        return result;
    }

    public static int multiplyRecursion(int x, int y){
        if (x == 0 || y == 0) {
            return 0;
        } else {
            if (x == 1){
                return y;
            } else {
                return x + (multiplyRecursion(x, y - 1));
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(Addition(4, 9));
        System.out.println(Subtraction(15, 7));
        System.out.println(multiply(4, 4));
        System.out.println(divide(29,3));
        System.out.println(modulus(100,100));
        System.out.println(loopMultiply(3, 4));
        System.out.println(multiplyRecursion(3, 5));

    }
}
