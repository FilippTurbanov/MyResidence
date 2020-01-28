package previous;

import java.util.Scanner;

public class Homework2_11 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Быстрая сортировка (сортировка с помощью разделения)." + '\n' + '\n');
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
        int[] finishNumbers = quickSort(numbers);
        System.out.println();
        System.out.print("Конечная последовательность: ");
        for (int i = 0; i < finishNumbers.length; i++) {
            System.out.print(finishNumbers[i]);
            if (i != finishNumbers.length - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }
    public static int[] quickSort(int[] numbers) {
        int mediana = numbers[(numbers.length - 1) / 2];
        int indexMediana = (numbers.length - 1) / 2;
        int memory;
        int pointer1;
        int pointer2;
        int indexPointer1 = 0;
        int indexPointer2 = numbers.length - 1;
        for (int a = 0; a <= indexMediana; a++) {
            pointer1 = numbers[a];
            indexPointer1 = a;
            if (pointer1 > mediana) {
                for (int b = indexPointer2; b >= indexMediana; b--) {
                    pointer2 = numbers[b];
                    indexPointer2 = b;
                    if (indexPointer2 == indexMediana) {
                        numbers[b] = pointer1;
                        numbers[a] = mediana;
                        indexMediana = indexPointer1;
                        break;
                    } else if (pointer2 < mediana) {
                        memory = pointer2;
                        numbers[b] = pointer1;
                        numbers[a] = memory;
                        break;
                    }
                }
            }
            else if (indexPointer1 == indexMediana) {
                for (int b = indexPointer2; b >= indexMediana; b--) {
                    pointer2 = numbers[b];
                    indexPointer2 = b;
                    if (pointer2 < mediana) {
                        numbers[a] = pointer2;
                        numbers[b] = mediana;
                        indexMediana = indexPointer2;
                        break;
                    }
                    else if (indexPointer2 == indexMediana)
                        break;
                }
            }
            System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        for (int i = 0; i < indexMediana; i++) {
            if (numbers[i] > numbers[i + 1]) {
                memory = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = 0;
                for (int i1 = i; i1 >= 0; i1--) {
                    if (i1 == 0) {
                        numbers[0] = memory;
                    }
                    else if (numbers[i1 - 1] > memory) {
                        numbers[i1] = numbers[i1 - 1];
                        numbers[i1 - 1] = 0;
                    }
                    else {
                        numbers[i1] = memory;
                        break;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = indexMediana + 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                memory = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = 0;
                for (int i1 = i; i1 >= 0; i1--) {
                    if (i1 == 0) {
                        numbers[0] = memory;
                    }
                    else if (numbers[i1 - 1] > memory) {
                        numbers[i1] = numbers[i1 - 1];
                        numbers[i1 - 1] = 0;
                    }
                    else {
                        numbers[i1] = memory;
                        break;
                    }
                }
            }
        }
        return numbers;
    }
}
