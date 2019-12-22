import java.util.Scanner;

public class Homework3_extra16 {
    public static void main(String[] args) {
        // Все простые делители заданного натурального числа
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Введите натуральное число: ");
        number = in.nextInt();
        int divider;
        int primeDivider;
        System.out.print("Все простые делители числа " + number +":");
        for (int i = number - 1; i >= 2; i--) {
            divider = i;
            if ((divider % 2 != 0) && (number % divider == 0)) {
                System.out.print(" ");
                primeDivider = divider;
                System.out.print(primeDivider);
            }
            else if ((divider == 2) && (number % divider == 0)) {
                System.out.print(" ");
                primeDivider = divider;
                System.out.print(primeDivider);
            }
        }
        System.out.println(".");
    }
}
