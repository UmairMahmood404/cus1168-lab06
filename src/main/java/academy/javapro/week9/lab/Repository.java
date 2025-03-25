package academy.javapro.week9.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Repository<T> {
    private final List<T> items;


    public Repository() {
        this.items = new ArrayList<>();
    }


    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (!items.contains(item)) {
            items.add(item);
        }
    }


    public boolean remove(T item) {
        return items.remove(item);
    }


    public List<T> find(Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }


    public List<T> getAll() {
        return Collections.unmodifiableList(items);
    }


    public int count() {
        return items.size();
    }


    public boolean contains(T item) {
        return items.contains(item);
    }
}
