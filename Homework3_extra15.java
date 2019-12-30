import java.util.Scanner;

public class Homework3_extra15 {
    public static void main(String[] args) {
        // Является ли число простым
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите натуральное число: ");
            number = in.nextInt();
        }
        while (number <= 1);
        int composite = 0;
        if ((number % 2 == 0) && (number != 2)) {
            System.out.println("Число составное.");
            composite++;
        }
        else {
            for (int i = number - 1; i >= 3; i--) {
                if (number % i == 0) {
                    System.out.println("Число составное.");
                    composite ++;
                    break;
                }
            }
        }
        if (composite == 0)
            System.out.println("Число простое.");
    }
}
