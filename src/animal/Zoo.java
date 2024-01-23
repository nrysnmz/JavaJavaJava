package animal;

public class Zoo {
    public static void main(String[] args) {

        Animal fish = new Fish("male", 20, 780);
        Bird bird = new Bird("female", 560, 35);
        Chicken chicken = new Chicken("female", 10, 34);
        Animal sparrow = new Sparrow("female", 34, 56.7);
        Flyable flyingBird1= new Sparrow("female",5,67);
        Flyable flyingBird2= new Bird("male",5,56);

        moveAnimal(fish);
        moveAnimal(sparrow);

//        sparrow.move();
//        sparrow.eat();
//        sparrow.sleep();
//        bird.sleep();
//        fish.move();
//        bird.giveInformation();
    }
    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
