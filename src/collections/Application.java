package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("there");
        arrayList.add("10");

        String item1 = (String) arrayList.get(2);
        System.out.println(item1);


        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(34);
        numbers.add(67);
        numbers.add(45);
        numbers.add(29);

        for(int number:numbers){
            System.out.println(number);
        }



    }
}
