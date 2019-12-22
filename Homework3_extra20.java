import java.util.Scanner;

public class Homework3_extra20 {
    public static void main(String[] args) {
        // Дружественные чи́сла — два различных натуральных числа, для которых сумма всех собственных делителей первого
        // числа равна второму числу и наоборот, сумма всех собственных делителей второго числа равна первому числу.
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте диапазон значений (min - max): ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int secondNumber;
        int amount1;
        int amount2;
        for (int i = number1; i <= number2; i++) {
            amount1 = 1;
            for (int a = i - 1; a >= 2; a--) {
                if (i % a == 0)
                    amount1 += a;
            }
            for (int i1 = number1; i1 <= number2; i1++) {
                amount2 = 1;
                secondNumber = i1;
                if (i == i1)
                    continue;
                for (int a1 = i1 - 1; a1 >= 2; a1--) {
                    if (i1 % a1 == 0)
                        amount2 += a1;
                }
                if ((amount1 == secondNumber) && (amount2 == i))
                    System.out.println("Числа " + number1 + " и " + number2 + " являются дружественными.");
                secondNumber = 0;
            }
        }
    }
}
