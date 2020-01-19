package collections;

import collections.dto.Passport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static List<Passport> list = new ArrayList<>();

    public void getList() { // генерируем список
        Passport passport = new Passport();
        for (int i = 0; i < 20; ++i) {
            passport.generatePassport();
            list.add(passport);
        }
    }

    public static void main(String[] args) {
        new Task2().getList();
        Iterator<Passport> iterator = list.iterator(); // реализуем итератор
        System.out.println("Сгенерированный Arraylist:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.iterator(); // возвращаем итератор в начало коллекции
        while (iterator.hasNext()) {
            Passport pass = iterator.next();
            iterator.remove();
        }
        list.iterator(); // возвращаем итератор в начало коллекции
        System.out.println("После удаления:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
