import java.lang.Iterable;
public interface Collection extends Iterable{
    int size();
    boolean isEmpty();
    boolean contains(Object item);
    boolean add();
    boolean remove(Object item);
    void clear();
}
