import java.util.Scanner;

public class Homework3_extra7 {
    public static void main(String[] args) {
        // поменять местами значения переменных без использования других переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        String a = Integer.toString(in.nextInt());
        String b = Integer.toString(in.nextInt());
        System.out.println();
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);
        a = a.concat(".");
        a = a.concat(b);
        b = a.substring(0, a.indexOf("."));
        a = a.substring(a.indexOf(".")+1);
        System.out.println();
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);
    }
}
