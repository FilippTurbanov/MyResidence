import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Циклы 1.3."+'\n'+'\n');
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число: ");
        int number = Math.abs(in.nextInt());
        int howManyNumerals = 1;
        int numberForNumerals = number;
        int factorial = 10;
        int composition;
        while (numberForNumerals >= 10) { // здесь мы узнаем количество цифр введенного числа
            numberForNumerals = numberForNumerals / 10;
            howManyNumerals ++;
        }
        int[] numerals = new int[howManyNumerals]; // создаем массив, состоящий из цифр введенного числа
        for (int i = 0; i < howManyNumerals; i++) {
            if (i == 0)
                numerals[numerals.length - 1 - i] = number % 10;
            else {
                for (int f = 0; f < i; f++) {
                    factorial *= 10;
                }
                numerals[numerals.length - 1 - i] = (number % factorial) / (factorial / 10);
                factorial = 10;
            }
        }
        for (int i = 0; i < numerals.length; i++) { // перемножение всех цифр между собой с выводом на консоль
            for (int z = 0; z < numerals.length; z++) {
                if (i == z)
                    continue;
                System.out.println(numerals[i] + " * " + numerals[z] + " = " + numerals[i]*numerals[z]);
            }
        }
        System.out.println();
        composition = numerals[0];
        for (int i = 0; i < numerals.length; i++) { // вычисляем произведение всех цифр введенного числа
            composition *= numerals[i];
        }
        for (int i = 0; i < numerals.length; i++) { // вывод в консоль произведения всех цифр
            if (i == numerals.length - 1)
                System.out.print(numerals[i] + " ");
            else
                System.out.print(numerals[i] + " * ");
        }
        System.out.println("= " + composition + ".");
    }
}
