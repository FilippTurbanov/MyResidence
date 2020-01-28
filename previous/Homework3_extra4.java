package previous;

import java.util.Scanner;

public class Homework3_extra4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number;
        do {
            System.out.print("Введите четырехзначное число: ");
            number = in.nextInt();
            if ((number < 1000) || (number > 9999))
                System.out.println("Неверный формат числа.");
        } while ((number < 1000) || (number > 9999));
        System.out.println();
        int n1, n2, n3, n4;
        n1 = number / 1000;
        n2 = (number % 1000) / 100;
        n3 = (number % 100) / 10;
        n4 = number % 10;
        if ((n1<n2) && (n2<n3) && (n3<n4))
            System.out.println("Возрастаюшая последовательность.");
        else
            System.out.println("Числа данного числа не являются возрастаюшей последовательностью.");
    }
}
