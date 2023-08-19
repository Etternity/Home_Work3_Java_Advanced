package Task2.com.example;
import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String dataToWrite = "Hello, world! This is an example of file I/O in Java.";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(dataToWrite);
            fileWriter.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
