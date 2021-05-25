public class ControlFlowExercises {
    public static void main(String[] args) {
        int j = 2;
        do {
            System.out.println(j*2);
            j+= j;

        } while (j < 1000000);
    }
}
