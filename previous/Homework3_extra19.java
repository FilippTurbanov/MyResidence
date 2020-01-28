package previous;

import java.util.Scanner;

public class Homework3_extra19 {
    public static void main(String[] args) {
        // Совершенное число - число, равное сумме всех своих делителей (включая единицу), кроме себя самого.
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Введите натуральное число: ");
        number = in.nextInt();
        int divider;
        int primeDivider;
        int amount = 1;
        System.out.print("Все делители числа " + number +":");
        for (int i = number - 1; i >= 2; i--) {
            divider = i;
            if (number % divider == 0) {
                System.out.print(" ");
                primeDivider = divider;
                amount += primeDivider;
                System.out.print(primeDivider);
            }
        }
        System.out.println(" 1.");
        if (number == amount)
            System.out.println("Данное число является совершенным.");
        else
            System.out.println("Данное число не является совершенным.");
    }
}
