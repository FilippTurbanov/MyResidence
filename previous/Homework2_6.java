package previous;

import java.util.Scanner;

public class Homework2_6 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Сортировка выбором."+'\n'+'\n');
        Scanner in = new Scanner (System.in);
        System.out.print("Введите размер последовательности: ");
        int amount = in.nextInt();
        System.out.println();
        int counter = 0;
        int[] numbers = new int[amount];
        while (counter != amount) {
            System.out.print("Введите число: ");
            numbers[counter] = in.nextInt();
            counter ++;
        }
        System.out.print("Начальная последовательность: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
        int index = 0;
        int y = numbers.length;
        for (int i = 0; i < y; y--) {
            System.out.println();
            int changingNumber2 = numbers[0];
            for (int z = 0; z < y; z++) {
                if (changingNumber2 < numbers[z]) {
                    changingNumber2 = numbers[z];
                    index = z;
                }
            }
            int changingNumber1 = numbers[y-1];
            numbers[y-1] = changingNumber2;
            numbers[index] = changingNumber1;
            index = 0;
            for (int element:numbers)
                System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Конечная последовательность: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1)
                System.out.print(numbers[i]+", ");
            else
                System.out.print(numbers[i]+".");
        }
    }
}
