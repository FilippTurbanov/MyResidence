package collections.types;

import java.util.Iterator;
import java.util.List;

public class CollectionType {

    public List filter(List collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (!(element instanceof String))
                iterator.remove();
        }
        return collection;
    }
}
