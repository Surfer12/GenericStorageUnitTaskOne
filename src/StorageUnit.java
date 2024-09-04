import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StorageUnit<T> extends GenericStorageUnit<T>{
    private List<T> items;

    public StorageUnit() {
        this.items = new ArrayList<>();
    }

    public boolean removeItem(Object item) {
        return items.remove(item);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return items.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public boolean remove(Object o) {
        return items.remove(o);
    }

    // ... other Collection methods with default implementations or custom logic as needed

    public int getItemCount() {
        return items.size();
    }

    public void performActionOnEachItem(Consumer action) {
        items.forEach(action);
    }

    public void removeItemsIf(Predicate filter) {
        items.removeIf(filter);
    }

    public Stream<T> stream() {
        return items.stream();
    }

    public Stream<T> parallelStream() {
        return items.parallelStream();
    }

    public void addItem(Object item) {
        items.add((T) item);
    }
}