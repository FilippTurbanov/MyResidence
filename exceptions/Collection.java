package exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        TestExceptions3 testExceptions3 = new TestExceptions3();
        int[] array = testExceptions3.getArray(5);
        Integer[] collection = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            collection[i] = array[i];
        }
        List <Integer> arrayList = Arrays.asList(collection);
        TreeSet <Integer> sortedCollection = new TreeSet<>(arrayList);
        System.out.println("Отсортированная коллекция: ");
        for (Integer a : sortedCollection) {
            System.out.println(a);
        }
    }
}
