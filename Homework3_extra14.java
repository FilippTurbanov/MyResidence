import java.util.Objects;
import java.util.Scanner;

public class Homework3_extra14 {
    public static void main(String[] args) {
        // Является ли число палиндромом
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        String number = Integer.toString(in.nextInt());
        // запишем реверсивно вторую половину числа
        // метод reverse() возвращает StringBuffer, поэтому кавычками меняем тип на String
        if (number.length() % 2 == 0) {
            String lastPartOfNumber = number.substring(number.length() / 2);
            StringBuffer rev = new StringBuffer(lastPartOfNumber);
            String reverse = "" + rev.reverse();
            if (Objects.equals((number.substring(0, (number.length() / 2))), reverse))
                System.out.println("Данное число является палиндромом.");
            else
                System.out.println("Данное число палиндромом не является.");
        }
        else {
            String lastPartOfNumber = number.substring(number.length() / 2 + 1);
            StringBuffer rev = new StringBuffer(lastPartOfNumber);
            String reverse = "" + rev.reverse();
            if (Objects.equals((number.substring(0, (number.length() / 2))), reverse))
                System.out.println("Данное число является палиндромом.");
            else
                System.out.println("Данное число палиндромом не является.");
        }
    }
}
