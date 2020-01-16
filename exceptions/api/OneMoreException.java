package exceptions.api;

public class OneMoreException extends Exception {

    public OneMoreException(String message) {
        super(message);
        System.out.println("OneMoreException: " + message); // для наглядного представления в ДЗ
    }
}
