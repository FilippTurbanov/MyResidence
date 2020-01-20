package collections;

import collections.types.CollectionType;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FilterApplicator {

    public static <Type> List filter(List<Type> collection, CollectionType<Type> type) {
        type.filter(collection);
        for (Type element : collection) {
            System.out.println(element);
        }
        return collection;
    }

    public static <Type extends Comparable> List sort(List<Type> collection) {
        Iterator<Type> i = collection.iterator();
        while (i.hasNext()) {
            Type element = i.next();
            if (!(element instanceof Integer)) {
                i.remove();
            }
        }
        Collections.sort(collection);
        return collection;
    }
}
