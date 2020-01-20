package collections.types;

import java.util.Iterator;
import java.util.List;

public class CollectionType <Type> {

    public <Type> List filter(List<Type> collection) {
        Iterator<Type> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Type element = iterator.next();
            if (!(element instanceof String))
                iterator.remove();
        }
        return collection;
    }
}
