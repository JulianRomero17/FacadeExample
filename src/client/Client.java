package client;

import facade.Facade;

public class Client {
    public static void main(String[] args) {
        String filePath = "test.txt";
        String originalContent = " Hola, patron Facade en Java!";

        // Obtener la instancia Singleton de Facade
        Facade facade = Facade.getInstance();

        facade.writeEncryptedFile(filePath, originalContent);

        String decryptedContent = facade.readAndDecryptFile(filePath);

        System.out.println("Contenido descifrado: " + decryptedContent);
    }
}

