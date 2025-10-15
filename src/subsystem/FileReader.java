package subsystem;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}

