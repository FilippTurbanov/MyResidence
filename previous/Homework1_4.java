package previous;

import java.util.Objects;
import java.util.Scanner;
public class Homework1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        }
        else if (Objects.equals(name, "Анастасия"))
            System.out.println("Я тебя так долго ждал!");
        else
            System.out.println("Добрый день, а вы кто?");
    }
}
