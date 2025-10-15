package subsystem;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
    public void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

