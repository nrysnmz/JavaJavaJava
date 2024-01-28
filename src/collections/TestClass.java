package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class TestClass {

    public static void main(String[] args) {

        HashSet<A> value= new HashSet<>();

        value.add(new A(3));
        value.add(new A(3));
        value.add(new A(3));
        System.out.println(value);

    }
}
class A{
   int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A a)) return false;
        return age == a.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
