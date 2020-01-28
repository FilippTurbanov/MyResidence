package previous;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String a = "Мама мыла раму";
        System.out.print("Введите текст: ");
        String b = in.nextLine();
        System.out.println(a == b.intern()); // будет true, т.к. первая строка была создана через литерал и
        // сразу попала в стринг пул, а вторая попала в стринг пул через метод intern().
    }
}
