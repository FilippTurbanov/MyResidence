package previous;

import java.util.Scanner;

public class Homework3_extra13 {
    public static void main(String[] args) {
        // Наибольшая цифра натурального числа
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();
        int tmpNumber = number;
        int counter = 1;
        // выясняем количество цифр в числе
        while (tmpNumber != 0) {
            tmpNumber = tmpNumber / 10;
            if (tmpNumber != 0)
                counter++;
        }
        // выясняем наибольшую цифру путем сравнения всех, начиная слева, записывая наибольший результат
        int counter2 = counter;
        int compareNumber;
        int finalNumber = 0;
        while (counter2 != 0) {
            compareNumber = number % ((int)(Math.pow(10, counter2))) / ((int)(Math.pow(10, counter2 - 1)));
            if (finalNumber < compareNumber)
                finalNumber = compareNumber;
            counter2--;
        }
        System.out.println("Наибольшая цифра в натуральном числе " + number + ": " + finalNumber + ".");
    }
}
