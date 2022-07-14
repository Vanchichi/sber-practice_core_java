import java.lang.Iterable;
public interface Collection<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    boolean contains(E item);
    boolean add();
    boolean remove(E item);
    void clear();
}
