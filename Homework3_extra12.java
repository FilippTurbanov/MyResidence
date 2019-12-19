import java.util.Random;
import java.util.Scanner;

public class Homework3_extra12 {
    public static void main(String[] args) {
        // Орел и решка
        int counter = 0;
        int heads = 0;
        int tails = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько раз Вы хотите подбросить монетку? ");
        int times = in.nextInt();
        while (counter != times) {
            Random random = new Random();
            int rnd = random.nextInt(1 + 1);
            if (rnd == 0)
                heads++;
            else
                tails++;
            counter++;
        }
        System.out.println();
        if ((((heads % 10 >= 2) && (heads % 10 <= 4)) && ((heads % 100 < 12) || (heads % 100 > 14))) &&
                (((tails % 10 >= 2) && (tails % 10 <= 4)) && ((tails % 100 < 12) || (tails % 100 > 14))))
            System.out.println("За " + times + " подбрасываний монетки орел выпал " + heads + " раза, а решка - " + tails +
                " раза.");
        else if ((((heads % 10 >= 2) && (heads % 10 <= 4)) && ((heads % 100 < 12) || (heads % 100 > 14))) &&
                (((tails % 10 < 2) || (tails % 10 > 4))))
            System.out.println("За " + times + " подбрасываний монетки орел выпал " + heads + " раза, а решка - " + tails +
                    " раз.");
        else if ((((heads % 10 < 2) || (heads % 10 > 4))) &&
                (((tails % 10 >= 2) && (tails % 10 <= 4)) && ((tails % 100 < 12) || (tails % 100 > 14))))
            System.out.println("За " + times + " подбрасываний монетки орел выпал " + heads + " раз, а решка - " + tails +
                    " раза.");
        else
            System.out.println("За " + times + " подбрасываний монетки орел выпал " + heads + " раз, а решка - " + tails +
                    " раз.");
    }
}
