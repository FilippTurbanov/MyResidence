package exceptions;

import java.util.Scanner;

public class TestExceptions3 {
    Scanner in = new Scanner(System.in);
    int incorrectInput = 0;

    public static void main(String[] args) {
        new TestExceptions3().getArray(5);
    }

    public int[] getArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = setElement(i);
        }
        System.out.print("Массив array = [");
        for (int arr : array) {
            System.out.print(" " + arr);
        }
        System.out.println(" ]");
        return array;
    }
    private int setElement(int i) {
        System.out.print("Введите " + (i+1) + "-й элемент: ");
        Integer element = null;
        try {
            element = Integer.parseInt(in.nextLine());
            incorrectInput = 0;
            return element;
        } catch (NumberFormatException e) {
            if (incorrectInput < 2) {
                System.out.println("Ошибка ввода: Вводите только цифры! Осталось попыток: " + (2 - incorrectInput));
                incorrectInput++;
                return setElement(i);
            } else {
                System.out.println("Сбой программы: Трёхкратный неверный ввод.");
                System.exit(0);
            }
        }
        return element;
    }
}
