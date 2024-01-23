package animal;

public class Bird extends Animal implements Flyable {
    public Bird(String gender, int age, double weight) {
        super(gender, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }

    @Override
    public void fly() {

    }
}

