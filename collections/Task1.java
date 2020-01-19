package collections;

import collections.dto.Passport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <Passport> arrayList = new ArrayList<>();
        List <Passport> linkedList = new LinkedList<>();
        Passport passport = new Passport();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; ++i) {
            passport.generatePassport();
            arrayList.add(passport);
        }
        long finish1 = System.currentTimeMillis();
        long time1 = finish1 - start1;
        System.out.println("Время генерации и добавления в ArrayList миллиона паспортов составило: "
                + time1 + " миллисекунд."); // 2,7-3 секунды для 10 млн; 0,30-0,35 секунд для 1 млн

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; ++i) {
            passport.generatePassport();
            linkedList.add(passport);
        }
        long finish2 = System.currentTimeMillis();
        long time2 = finish2 - start2;
        System.out.println("Время генерации и добавления в LinkedList миллиона паспортов составило: "
                + time2 + " миллисекунд."); // 5,6-6 секунд для 10 млн; 0,28-0,30 секунд для 1 млн

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; ++i) {
            arrayList.remove(0);
        }
        long finish3 = System.currentTimeMillis();
        long time3 = finish3 - start3;
        System.out.println("Время удаления из ArrayList миллиона паспортов составило: "
                + time3 + " миллисекунд."); // ~111,75 сек на 1 млн; ~24,6 сек на 100 тыс.

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; ++i) {
            linkedList.remove(i);
        }
        long finish4 = System.currentTimeMillis();
        long time4 = finish4 - start4;
        System.out.println("Время удаления из LinkedList миллиона паспортов составило: "
                + time4 + " миллисекунд."); // ~19,2 сек на 100 тыс.
    }
}
