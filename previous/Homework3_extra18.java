package previous;

import java.util.Scanner;

public class Homework3_extra18 {
    public static void main(String[] args) {
        // найти количество различных цифр у заданного натурального числа
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();
        int tmpNumber = number;
        int counter = 1;
        // выясняем количество цифр в числе
        while (tmpNumber != 0) {
            tmpNumber = tmpNumber / 10;
            if (tmpNumber != 0)
                counter++;
        }
        int counter2 = counter;
        int compareNumber;
        String compareList = "";
        int finalCounter = 0;
        while (counter2 != 0) {
            compareNumber = number % ((int)(Math.pow(10, counter2))) / ((int)(Math.pow(10, counter2 - 1)));
            if (compareList.indexOf(""+compareNumber) == -1)
                finalCounter ++;
            compareList += "" + compareNumber;
            counter2--;
        }
        System.out.println("Количество различных цифр в заданном числе " + number + ": " + finalCounter + ".");
    }
}
