import java.util.NoSuchElementException;

public abstract class LinkedList implements List, Deque {
    private Node first;
    private Node last;
    private int size;
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean contains(Object item) {
        Node node = first;
        while (node != null) {
            if (node.item.equals(item)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    @Override
    public boolean add(Object item) {
        Node node = new Node();
        node.item = item;

        if (first == null){
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;
        return false;
    }
    @Override
    public boolean remove(Object item) {
        Node node = first;
        boolean isDelete = false;
        while (node != null) {
            if (node.item.equals(item)) {
                node.item = null;
                isDelete = true;
                size = size - 1;
            }
            node = node.next;
        }
        return isDelete;
    }
    @Override
    public void clear() {
        Node node = first;
        int i = 0;
        while (i <= size) {
            node.item = null;
            node = node.next;
            i++;
        }
        size = 0;
    }
    @Override
    public void add(int index, Object item) {
        Node node = new Node();
        node.item = item;

        if (first == null){
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;
    }
    @Override
    public void set(int index, Object item) {
        Node node = first;
        int i = 0;
        if (index == size){
            addLast(item);
        } else {
            while(i < index){
                i++;
                node = node.next;
            }
            node.item = item;
        }
    }
    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        int i = 0;
        Node node = first;
        while (i <= index){
            if (i == index){
                return node.item;
            }
            node = node.next;
            i++;
        }
        return null;
    }
    @Override
    public int indexOf(Object item) {
        int j = -1;
        int i=0;
        Node node = first;
        boolean isFirst = false;
        while (i <= size){
            if ((node.item.equals(item))&(isFirst == false)){
                j = i;
                isFirst = true;
            }
            node = node.next;
            i++;
        }
        return j;
    }
    @Override
    public int lastIndexOf(Object item) {
        int j = -1;
        int i=0;
        Node node = first;
        while (i <= size){
            if (node.item.equals(item)){
                j = i;
            }
            node = node.next;
            i++;
        }
        return j;
    }
    @Override
    public Object remove(int index) throws IndexOutOfBoundsException{
        Object copyN;
        Node node = first;
        int i = 0;
        while (i <= index) {
            if (i == index){
                copyN = node.item;
                node.item = null;
                size = size - 1;
                return copyN;
            } else
            {i = i + 1;}
            node = node.next;
        }
        return null;
    }
    @Override
    public Object[] subList(int from, int to) throws IndexOutOfBoundsException{
        return null;
    }
    @Override
    public Object addFirst(Object item) {
        add();
        return null;
    }
    @Override
    public Object addLast(Object item) {
        Node node = last;
        return null;
    }
    @Override
    public Object getFirst() throws NoSuchElementException {
        return first.item;
    }
    @Override
    public Object getLast() throws NoSuchElementException{
        return last.item;
    }
    @Override
    public Object pollFirst() {
        return null;
    }
    @Override
    public Object pollLast() {
        return null;
    }
    @Override
    public Object removeFirst() throws NoSuchElementException{
        return null;
    }
    @Override
    public Object removeLast() throws NoSuchElementException{
        return null;
    }
    class Node {
        Object item;
        Node next;
        Node prev;
    }
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node node = first;
        while (node != null){
            res.append(node.item);
            node = node.next;
        }
        return res.toString();
    }
}
