package Task4.com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    public static void main(String[] args) {
        String filePath = "textfile.txt";

        try {
            String fileContent = readFileContent(filePath);
            System.out.println("File Content:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static String readFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
}