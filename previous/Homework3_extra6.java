package previous;

import java.util.Scanner;

public class Homework3_extra6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите семизначное число: ");
            number = in.nextInt();
            if ((number < 1000000) || (number > 9999999))
                System.out.println("Неверный формат числа.");
        } while ((number < 1000000) || (number > 9999999));
        System.out.println();
        String numb = Integer.toString(number);
        char[] reverse = numb.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
    }
}
