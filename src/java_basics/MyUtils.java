package java_basics;

public class MyUtils {
    public static String printSomeJunk(String arg) {
        return arg;
//        System.out.println("Some bla bla bla" + arg);
    }

    public static void printSomeJunk(int arg) {
        System.out.println("Integer passed in: " + arg);
    }
    public static void sum2Numbers(int firstArg,int secondArg){
        System.out.println(firstArg+secondArg);
    }
    public static int add10(int someArgument){
       int result= someArgument+10;
       return result;

    }
}
