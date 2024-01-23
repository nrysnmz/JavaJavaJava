package preprequisite_OOP;

public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Jane Tears",34,190,"green");
        Human human2 = new Human("Mike Kyle", 29,167,"brown");
        Human human3 = new Human("Adam Teen",65,190,"blue");

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
