package collections;

import collections.types.CollectionType;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FilterApplicator {
    public static void main(String[] args) {
        List test = new LinkedList();
        addList(test);
        Iterator i = test.iterator();
        System.out.print("Коллекция: ");
        while (i.hasNext()) {
            Object element = i.next();
            System.out.print(element + " ");
        }
        filter(test, new CollectionType());
        Iterator i2 = test.iterator();
        System.out.println();
        System.out.print("Отфильтрованная коллекция: ");
        while (i2.hasNext()) {
            Object element = i2.next();
            System.out.print(element + " ");
            i2.remove();
        }
        addList(test);
        sort(test);
        Iterator i3 = test.iterator();
        System.out.println();
        System.out.print("Отсортированная коллекция: ");
        while (i3.hasNext()) {
            Object element = i3.next();
            System.out.print(element + " ");
        }
    }

    public static List filter(List collection, CollectionType type) {
        type.filter(collection);
        return collection;
    }

    public static List sort(List collection) {
        Iterator i = collection.iterator();
        while (i.hasNext()) {
            Object element = i.next();
            if (!(element instanceof Integer)) {
                i.remove();
            }
        }
        Collections.sort(collection);
        return collection;
    }

    public static List addList(List collection) {
        collection.add("Abrakadabra");
        collection.add("anySentence");
        collection.add(123);
        collection.add(23410);
        return collection;
    }
}
