public interface Deque extends Collection{
    Object addFirst(Object item);
    Object addLast(Object item);
    Object getFirst();
    Object getLast();
    Object pollFirst();
    Object pollLast();
    Object removeFirst();
    Object removeLast();
}