package collections2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal= new Animal("Dog",12);
        Animal animal1= new Animal("Cat", 8);
        Animal animal2= new Animal("Bird", 3);
        Animal animal3= new Animal("Dog", 12);
        Animal animal4= new Animal("Kangroo", 24);

        Collections.addAll(animals,animal, animal1, animal2, animal3, animal4);



        for (Animal value :animals){
            System.out.println(value);
        }





//       HashSet<Integer> values = new HashSet<Integer>();
//        values.add(12);
//        values.add(43);
//        values.add(15);
//        values.add(67);
//        values.add(43);
//        for (Integer value : values) {
//            System.out.println(value);
//        }
//        HashSet<String> objects = new HashSet<String>();
//        objects.add("Random");
//        objects.add("Animal");
//        objects.add("People");
//        objects.add("Random");
//        objects.add("Random");
//        for (String object : objects) {
//            System.out.println(object);
//        }
//        LinkedHashSet<String> words= new LinkedHashSet<String>();
//        words.add("Name");
//        words.add("Shin");
//        words.add("Pin");
//        words.add("Ache");
//        words.add("Drug");
//        for (String word: words){
//            System.out.println(word);
//        }


    }
}

