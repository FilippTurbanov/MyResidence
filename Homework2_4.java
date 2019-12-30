import java.util.Arrays;
import java.util.Scanner;

public class Homework2_4 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Массивы 2.1."+'\n'+'\n');
        Scanner in = new Scanner (System.in);
        int[] array = new int[5];
        int counter = 0;
        while (counter != array.length) {
            System.out.print("Введите число: ");
            array[counter] = in.nextInt();
            counter ++;
        }
        int index = 0;
        do {
            System.out.print(array[index] + " ");
            index ++;
        } while (index != array.length);
        System.out.println();
        index = 0;
        while (index != array.length) {
            System.out.print(array[index] + " ");
            index++;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Бонус: ");
        System.out.print(Arrays.toString(array));
    }
}
