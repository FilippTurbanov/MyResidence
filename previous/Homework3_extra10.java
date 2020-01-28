package previous;

import java.util.Objects;
import java.util.Scanner;

public class Homework3_extra10 {
    public static void main(String[] args) {
        // Гласная ли буква
        Scanner in = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String letter = in.nextLine();
        String[] vowels = {"а", "о", "у", "э", "ы", "и", "е", "ё", "ю", "я", "А", "О", "У", "Э", "Ы", "И", "Е", "Ё", "Ю", "Я"};
        boolean isVowel = false;
        // 1-й способ
        for (int i = 0; i <= 19; i++) {
            if (letter.equalsIgnoreCase(vowels[i])) {
                System.out.println("Буква гласная.");
                isVowel = true;
                break;
            }

        }
        if (isVowel == false)
            System.out.println("Буква согласная.");
        // 2-й способ
        isVowel = false;
        for (int i = 0; i <= 19; i++) {
            if (Objects.equals(letter, vowels[i])) {
                System.out.println("Буква гласная.");
                isVowel = true;
                break;
            }

        }
        if (isVowel == false)
            System.out.println("Буква согласная.");
        // 3-й способ
        String vowels2 = "аоуэыиеёюяАОУЭЫИЕЁЮЯ";
        isVowel = false;
        for (int i = 0; i <= 19; i++) {
            if (letter.charAt(0) == (vowels2.charAt(i))) {
                System.out.println("Буква гласная.");
                isVowel = true;
                break;
            }
        }
        if (isVowel == false)
            System.out.println("Буква согласная.");
        // 4-й способ
        int index = vowels2.indexOf(letter);
        if (index == -1)
            System.out.println("Буква согласная.");
        else
            System.out.println("Буква гласная.");
    }
}
