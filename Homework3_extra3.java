import java.util.Scanner;

public class Homework3_extra3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите радиус первого круга: ");
        int r1 = in.nextInt();
        System.out.print("Введите радиус второго круга: ");
        int r2 = in.nextInt();
        float sq1, sq2, sq3;
        sq1 = 3.1415f * r1 * r1;
        sq2 = 3.1415f * r2 * r2;
        sq3 = sq1 - sq2;
        System.out.println();
        System.out.print("Площадь кольца составляет: ");
        System.out.println(sq3);
    }
}
