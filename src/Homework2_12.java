import java.util.Scanner;

public class Homework2_12 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        Scanner in = new Scanner (System.in);
        int[] array = new int[10];
        int counter = 0;
        while (counter != array.length) {
            System.out.print("Введите число: ");
            array[counter] = in.nextInt();
            counter ++;
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int indexCounter = 0;
        int isItZero = 0;
        for (int i = 0; i < array.length; i++) { // проверка массива на наличие элемента "0"
            if (array[i] == 0) {
                isItZero++;
                indexCounter++;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) { // все повторные элементы приравниваем к нулю
            for (int y = 0; y < array.length; y++) {
                if (i == y)
                    continue;
                else if (array[i] == 0)
                    continue;
                else if (array[i] == array[y])
                    array[y] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) { // считаем уникальные элементы
            if (array[i] != 0)
                indexCounter++;
        }
        int[] array2 = new int[indexCounter]; // создаём массив без дубликатов
        int indexCounter2 = 0;
        if (isItZero > 0) {
            array2[0] = 0;
            indexCounter2++;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    array2[indexCounter2] = array[i];
                    indexCounter2++;
                }
            }
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    array2[indexCounter2] = array[i];
                    indexCounter2++;
                }
            }
        }
        System.out.println();
        System.out.print("Массив без дубликатов: "); // выводим на консоль массив без дубликатов
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println('\n');
        System.out.print("Шейкерная сортировка:");
        int leng = array2.length;
        int changingNumber1;
        for (int i = 0; i < leng; leng--) {
            System.out.println();
            for (int z = 0; z < leng - 1; z++) {
                changingNumber1 = array2[z];
                if (changingNumber1 > array2[z+1]) {
                    int changingNumber2 = array2[z+1];
                    array2[z+1] = changingNumber1;
                    array2[z] = changingNumber2;
                }
            }
            for (int z = leng-1; z >= i + 1; z--) {
                changingNumber1 = array2[z];
                if (changingNumber1 < array2[z-1]) {
                    int changingNumber2 = array2[z-1];
                    array2[z-1] = changingNumber1;
                    array2[z] = changingNumber2;
                }
            }
            for (int f = 0; f < array2.length; f++)
                System.out.print(array2[f] + " ");
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
