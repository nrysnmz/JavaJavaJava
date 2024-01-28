package practice.loops.Loops;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i=0; i<=100; i+=2){
            System.out.println(i);
        }
    }
}