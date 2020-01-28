package previous;

import java.util.Scanner;

public class Homework2_7 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Пузырьковая сортировка."+'\n'+'\n');
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
        int y = numbers.length;
        int changingNumber1;
        for (int i = 0; i < y; y--) {
            System.out.println();
            for (int z = 0; z < y - 1; z++) {
                changingNumber1 = numbers[z];
                if (changingNumber1 > numbers[z+1]) {
                    int changingNumber2 = numbers[z+1];
                    numbers[z+1] = changingNumber1;
                    numbers[z] = changingNumber2;
                }
            }
            for (int f = 0; f < numbers.length; f++)
                System.out.print(numbers[f] + " ");
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
