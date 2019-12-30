import java.util.Objects;
import java.util.Scanner;
public class Homework1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        }
        if (Objects.equals(name, "Анастасия"))
            System.out.println("Я тебя так долго ждал!");
        if (!((Objects.equals(name, "Вася")) || (Objects.equals(name, "Анастасия"))))
            System.out.println("Добрый день, а вы кто?");
    }
}
