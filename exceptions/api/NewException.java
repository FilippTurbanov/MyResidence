package exceptions.api;

public class NewException extends Exception {

    public NewException(String message) {
        super(message);
        System.out.println("NewException: " + message); // для наглядного представления в ДЗ
    }
}
