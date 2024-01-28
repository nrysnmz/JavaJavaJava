package practice.loops.Loops;

public class NestedForLoop {

    public static void main(String[] args) {
        int counter = 0;
        for (int index = 0; index < 10; index++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("The value of index was " + index + "------" + j);
            }
        }
        System.out.println("COUNTER: " + counter);
    }
}
