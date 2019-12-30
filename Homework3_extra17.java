import java.util.Scanner;

public class Homework3_extra17 {
    public static void main(String[] args) {
        // найти НОК и НОД двух чисел
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два натуральных числа: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int divider;
        String primeDivider1 = "";
        String primeDivider2 = "";
        // все простые делители обоих чисел
        for (int i = number1 - 1; i >= 2; i--) {
            divider = i;
            if ((divider % 2 != 0) && (number1 % divider == 0))
                primeDivider1 += ""+ divider + " ";
            else if ((divider == 2) && (number1 % divider == 0))
                primeDivider1 += ""+ divider + " ";
        }
        for (int i = number2 - 1; i >= 2; i--) {
            divider = i;
            if ((divider % 2 != 0) && (number2 % divider == 0))
                primeDivider2 += ""+ divider + " ";
            else if ((divider == 2) && (number2 % divider == 0))
                System.out.print(" ");
                primeDivider2 += ""+ divider + " ";
        }
    }
}
