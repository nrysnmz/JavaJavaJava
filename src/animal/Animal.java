package animal;

public abstract class Animal {

    String gender;
    int age;
    double weight;

    public Animal(String gender, int age, double weight) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void giveInformation() {
        System.out.println("It's a " + gender);
        System.out.println("This animal is " + age + " years old.");
        System.out.println("This animal weighs " + weight + " pounds.");
    }

    public void eat() {
        System.out.println("This animal is eating.");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
    public abstract void move();


}
