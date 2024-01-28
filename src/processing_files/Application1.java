package processing_files;

import java.io.*;


public class Application1 {
    public static void main(String[] args) {
        File file = new File("C:\\workspacechase\\JavaProjects\\oracle\\src\\myfile.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file" + file.getName());
        }
    }
}
