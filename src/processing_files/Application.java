package processing_files;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Application {
    public static void main(String[] args) {
//        for(int i=0; i<=3; i++){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter some Text");
//            String name = scanner.nextLine();
//            System.out.println(name);
//        }
        try {
            File file = new File("myfile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
//            throw new RuntimeException(e);
        }
    }
}
