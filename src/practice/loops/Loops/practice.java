package practice.loops.Loops;

public class practice {
    public static void main(String[] args) {
//        int count = 0;
//        while (count <= 100) {
//            System.out.println("Nuray " + count);
//            count = count + 1;
//
//            if (count == 20) {
//                break;}
        String string = "We have a large inventory of things in our warehouse falling in"
                + "the category:apperal and the slightly"
                + "more in demand category:makeup along with the category:furniture and ...";
        printCategories(string);


    }

    //    Extract all categories from the string argument
    public static void printCategories(String string) {
        int i = 0;
        while (true) {
            int found = string.indexOf("category:", i);
            if (found == -1) break;
            int start = found + 9;
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end + i;

        }
    }
}
