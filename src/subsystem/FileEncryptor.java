package subsystem;

import java.util.Base64;

public class FileEncryptor {
    public String encrypt(String content) {
        return Base64.getEncoder().encodeToString(content.getBytes());
    }

    public String decrypt(String encryptedContent) {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedContent);
        return new String(decodedBytes);
    }
}
