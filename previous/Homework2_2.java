package previous;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        System.out.println("Турбанов Филипп.");
        System.out.println("Циклы 1.2."+'\n'+'\n');
        int factorial = 1;
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    System.out.print(number +"! = " + factorial);
    }
}
