package previous;

import java.util.Scanner;

public class Homework3_extra9 {
    public static void main(String[] args) {
        // В молодом возрасте дракон каждый год отращивает по три головы, но после того, как ему исполнится 200 лет –
        // только по две, а после 300 лет – лишь по одной. Предполагается, что дракон появляется на свет сразу с тремя
        // головами. Высчитать, сколько голов и глаз у дракона, которому N лет.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст дракона: ");
        int age = in.nextInt();
        int headCounter = 3;
        int eyesCounter = 6;
        int yearCounter = 0;
        while (yearCounter != age) {
            if (yearCounter < 200) {
                headCounter += 3;
                eyesCounter += 6;
                yearCounter ++;
            }
            else if (yearCounter < 300) {
                headCounter += 2;
                eyesCounter += 4;
                yearCounter ++;
            }
            else if (yearCounter > 300) {
                headCounter += 1;
                eyesCounter += 2;
                yearCounter ++;
            }
        }
        System.out.println("В возрасте " + age + " лет количество голов и глаз у дракона составляет: " + headCounter +
                ", " + eyesCounter);
    }
}
