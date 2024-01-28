package practice.strings;

import java.time.LocalDate;
import java.util.stream.Stream;

public class StringsPractice {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        System.out.println(str.length());

        String a = "JustMoonThings";
        String b = "" + "JustMoonThings";
        System.out.println(a.equals(b));

        LocalDate date = LocalDate.of(2018, 02, 02);
        System.out.println(date.getMonthValue());

        byte number = 100;
        switch (number) {
            case '7':
                System.out.println("A");
                break;
            case 100:
                System.out.println("B");
                break;

        }
        Stream<Integer>numStream= Stream.of(10,20,30);
        numStream.map(n ->n+10).peek(s-> System.out.println(s));
        numStream.forEach(s-> System.out.println(s));

    }
}
