package animal;

public class Fish extends Animal {
    public Fish(String gender, int age, double weight) {
        super(gender, age, weight);
    }

    @Override
    public void move() {
        System.out.println("fish is swimming...");
    }

    public void swim() {
        System.out.println("This fish can swim.");
    }
}
