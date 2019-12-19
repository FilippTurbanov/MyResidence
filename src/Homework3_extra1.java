import java.util.Scanner;

public class Homework3_extra1 {
    public static void main(String[] args) {
        // проверка на равенство введенных чисел
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Введите число: ");
        int b = in.nextInt();
        System.out.print("Введите число: ");
        int c = in.nextInt();
        if ((a != b) && (b!=c))
            System.out.println("Данные числа не равны.");
        else
            System.out.println("Среди данных чисел минимум два равны.");
    }
}
