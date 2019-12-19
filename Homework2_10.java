import java.util.Scanner;

public class Homework2_10 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Сортировка слиянием." + '\n' + '\n');
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер последовательности: ");
        int amount = in.nextInt();
        System.out.println();
        int counter = 0;
        int[] numbers = new int[amount];
        while (counter != amount) {
            System.out.print("Введите число: ");
            numbers[counter] = in.nextInt();
            counter++;
        }
        System.out.print("Начальная последовательность: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
        int len;
        if ((numbers.length % 2) == 0)
            len = (numbers.length / 2) - 1;
        else
            len = numbers.length / 2;
        for (int i = 0; i < len; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int memory = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = memory;
                if (i == 0)
                    continue;
                for (int i1 = i; i1 > 0; i1--) {
                    while (numbers[i1 - 1] > numbers[i1]) {
                        memory = numbers[i1];
                        numbers[i1] = numbers[i1 - 1];
                        numbers[i1 - 1] = memory;
                    }
                }
            }
        }
        for (int i = len + 1; i < (numbers.length - 1); i++) {
            if (numbers[i] > numbers[i + 1]) {
                int memory = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = memory;
                if (i == len + 1)
                    continue;
                for (int i1 = i; i1 > (len + 1); i1--) {
                    while (numbers[i1 - 1] > numbers[i1]) {
                        memory = numbers[i1];
                        numbers[i1] = numbers[i1 - 1];
                        numbers[i1 - 1] = memory;
                    }
                }
            }
        }
        System.out.println();
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        int[] finishNumbers = new int[amount];
        int index = 0;
        int controlIndex = 0;
        for (int i = 0; i <= len; i++) {
            for (int i1 = len + 1; i1 < numbers.length; i1++) {
                if (i1 <= controlIndex)
                    continue;
                else if (numbers[i] > numbers[i1]) {
                    finishNumbers[index] = numbers[i1];
                    index++;
                    controlIndex = i1;
                }
                else {
                    finishNumbers[index] = numbers[i];
                    index++;
                    break;
                }
            }
        }
        while (index != finishNumbers.length) {
            for (int i = controlIndex + 1; i < numbers.length; i++) {
                finishNumbers[index] = numbers[i];
                index++;
            }
        }
        System.out.println();
        System.out.print("Конечная последовательность: ");
        for (int i = 0; i < finishNumbers.length; i++) {
            System.out.print(finishNumbers[i]);
            if (i != numbers.length - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }
}
