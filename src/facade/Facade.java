package facade;

import subsystem.FileReader;
import subsystem.FileWriter;
import subsystem.FileEncryptor;

public class Facade {
    private static Facade instance;  // instancia estática única

    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileEncryptor fileEncryptor;

    private Facade() {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        fileEncryptor = new FileEncryptor();
    }

    // método para obtener la única instancia (Singleton)
    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void writeEncryptedFile(String filePath, String content) {
        String encryptedContent = fileEncryptor.encrypt(content);
        fileWriter.writeFile(filePath, encryptedContent);
    }

    public String readAndDecryptFile(String filePath) {
        String encryptedContent = fileReader.readFile(filePath);
        return fileEncryptor.decrypt(encryptedContent);
    }
}

