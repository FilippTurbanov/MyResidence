import java.util.Scanner;

public class Homework3_extra5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number;
        do {
            System.out.print("Введите шестизначное число: ");
            number = in.nextInt();
            if ((number < 100000) || (number > 999999))
                System.out.println("Неверный формат числа.");
        } while ((number < 100000) || (number > 999999));
        System.out.println();
        int n1, n2, n3, n4, n5, n6;
        n1 = number / 100000;
        n2 = (number % 100000) / 10000;
        n3 = (number % 10000) / 1000;
        n4 = (number % 1000) / 100;
        n5 = (number % 100) / 10;
        n6 = number % 10;
        int composition = n1*n2*n3*n4*n5*n6;
        double arithmeticlMean, geometricMean;
        arithmeticlMean = (n1+n2+n3+n4+n5+n6)/6.0;
        geometricMean = Math.pow(composition, 1.0 / 6);
        System.out.println("Среднее арифметическое цифр данного числа равно: "+arithmeticlMean);
        System.out.println("Среднее геометрическое цифр данного числа равно: "+geometricMean);
    }
}
