package previous;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Класс сортировок."+'\n'+'\n');
        Scanner in = new Scanner(System.in);
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
        // здесь вводится метод сортировки и параметр (в данном случае имя массива)
        int[] test1 = selectSort(numbers);
        int[] test2 = bubbleSort(numbers);
        int[] test3 = shakerSort(numbers);
        int[] test4 = insertSort(numbers);
        int[] test5 = quickSort(numbers);
        int[] test6 = mergeSort(numbers);
        System.out.println();
        for (int a:test1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a:test2) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a:test3) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a:test4) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a:test5) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a:test6) {
            System.out.print(a + " ");
        }
    }
    public static int[] selectSort(int[] numbers) {
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
        return numbers;
    }
    public static int[] bubbleSort(int[] numbers) {
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
        return numbers;
    }
    public static int[] shakerSort(int[] numbers) {
        int leng = numbers.length;
        int changingNumber1;
        for (int i = 0; i < leng; leng--) {
            System.out.println();
            for (int z = 0; z < leng - 1; z++) {
                changingNumber1 = numbers[z];
                if (changingNumber1 > numbers[z+1]) {
                    int changingNumber2 = numbers[z+1];
                    numbers[z+1] = changingNumber1;
                    numbers[z] = changingNumber2;
                }
            }
            for (int z = leng-1; z >= i + 1; z--) {
                changingNumber1 = numbers[z];
                if (changingNumber1 < numbers[z-1]) {
                    int changingNumber2 = numbers[z-1];
                    numbers[z-1] = changingNumber1;
                    numbers[z] = changingNumber2;
                }
            }
            for (int f = 0; f < numbers.length; f++)
                System.out.print(numbers[f] + " ");
        }
        return numbers;
    }
    public static int[] insertSort(int[] numbers) {
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
        return numbers;
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
    public static int[] mergeSort(int[] numbers) {
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
        int[] finishNumbers = new int[numbers.length];
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
                } else {
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
        return numbers;
    }
}
