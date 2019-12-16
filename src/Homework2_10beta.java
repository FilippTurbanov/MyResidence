import java.util.Scanner;

public class Homework2_10beta {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Сортировка слиянием."+'\n'+'\n');
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
        int coupleCounter = 0;
        int forCompare = amount;
        while (forCompare > 1) {
            forCompare -= 2;
            coupleCounter++;
        }
        for (int i = coupleCounter; i > 0; i--) {
            int index1 = amount - 2 * i;
            int index2 = index1 + 1;
            if (numbers[index1] > numbers[index2]) {
                int memory = numbers[index2];
                numbers[index2] = numbers[index1];
                numbers[index1] = memory;
            }
        }
        System.out.println();
        for (int element:numbers) {
            System.out.print(element + " ");
        }
    }
}
