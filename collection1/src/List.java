public interface List extends Collection{
    boolean add((Object item);

    void add(int index, Object item);
    void set(int index, Object item);
    Object get(int index);
    int indexOf(Object item);
    int lastIndexOf(Object item);
    Object remove(int index);
    Object[] subList(int from, int to);
}
