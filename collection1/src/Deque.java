public interface Deque<E> extends Collection<E> {
    E addFirst(E item);
    E addLast(E item);
    E getFirst();
    E getLast();
    E pollFirst();
    E pollLast();
    E removeFirst();
    E removeLast();
}