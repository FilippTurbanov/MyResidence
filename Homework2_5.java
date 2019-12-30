import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Массивы 2.2."+'\n'+'\n');
        Scanner in = new Scanner (System.in);
        int[] array = new int[8];
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
        System.out.println();
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 1; i < array.length; i +=2) {
            System.out.print(array[i] + " ");
        }
    }
}
