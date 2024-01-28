package collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Lions");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

//     for(int i=0; i<animals.size(); i++){
//         System.out.println(animals.get(i));
//     }
//     for (String animal:animals){
//         System.out.println(animal);
        List<Vehicle> vehicles = new LinkedList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
        vehicles.add(new Vehicle("Honda", "accord", 14000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
//        for (Vehicle car : vehicles) {
//            System.out.println(car);
//
//        }
        printElements(vehicles);
        printElements(animals);
    }

    public static void printElements(List someLists) {
        for (int i = 0; i < someLists.size(); i++) {
            System.out.println(someLists.get(i));
        }
    }
}
