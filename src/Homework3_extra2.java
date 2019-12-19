import java.util.Scanner;

public class Homework3_extra2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите массу динозавтра (в кг): ");
        int m = in.nextInt();
        System.out.println();
        long mg, gr;
        float t;
        t = m / 1000f;
        gr = m * 1000l;
        mg = gr * 1000l;
        System.out.println("Вес динозавтра составляет: ");
        System.out.println(t + " тонн " + "или " + gr + " грамм, " + "или " + mg + " миллиграмм.");
    }
}
