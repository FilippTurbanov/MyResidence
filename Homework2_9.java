import java.util.Scanner;

public class Homework2_9 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Сортировка с помощью включения (сортировка вставками)."+'\n'+'\n');
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
        int memory;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                memory = numbers[i+1];
                numbers[i+1] = numbers[i];
                numbers[i] = 0;
                for (int i1 = i; i1 >= 0; i1--) {
                    if (i1 == 0) {
                        numbers[0] = memory;
                    }
                    else if (numbers[i1-1] > memory) {
                        numbers[i1] = numbers[i1-1];
                        numbers[i1-1] = 0;
                    }
                    else {
                        numbers[i1] = memory;
                        break;
                    }
                }
                System.out.println();
                for (int a:numbers) {
                    System.out.print(a + " ");
                }
            }
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
