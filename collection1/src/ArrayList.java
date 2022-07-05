import java.util.Arrays;

public class ArrayList implements List{
    int size;
    int capacity = 10;
    Object[] arr = new Object[size];
    private Object item;

    @Override
    public int size() {return size;}
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
        boolean isMatch = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                isMatch = true;
            }
        }
        return isMatch;
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean add(Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;
            Object[] newArr = new Object[capacity];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = item;
        size++;
        return false;
    }

    @Override
    public void add(int index, Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;
            Object[] newArr = new Object[capacity];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index] = item;
        size++;
        Object y;
        for(int i = index + 1; i < size - 1; i++){
            y = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = y;
        }
    }

    @Override
    public boolean remove(Object item) {
        boolean isDelete = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                arr[i] = null;
                isDelete = true;
                size = size - 1;
            }
        }
        return isDelete;
    }
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }



    @Override
    public void set(int index, Object item) {
        if (index == size){
            add();
        } else {
            arr[index] = item;
            size++;
        }
    }
    @Override
    public Object get(int index) throws IndexOutOfBoundsException{
        if ((isEmpty() == false)&(arr[index] != null)){
            return arr[index];
        }
        return null;
    }
    @Override
    public int indexOf(Object item) {
        int j = -1;
        boolean isFirst = false;
        for (int i = 0; i < size; i++){
            if ((arr[i].equals(item))&(isFirst == false)){
                j = i;
                isFirst = true;
            }
        }
        return j;
    }
    @Override
    public int lastIndexOf(Object item) {
        int j = -1;
        for (int i = 0; i < size; i++){
            if (arr[i].equals(item)){
                j = i;
            }
        }
        return j;
    }
    @Override
    public Object remove(int index) throws IndexOutOfBoundsException{
        Object copyA;
        if (arr[index] != null){
            copyA = arr[index];
            arr[index] = null;
            return copyA;
        }
        size = size - 1;
        return null;
    }
    @Override
    public Object[] subList(int from, int to) throws IndexOutOfBoundsException{
        if (size <= capacity){
            Object[] newArr = new Object[to-from];
            for(int i = from; i < to; i++){
                newArr[i] = arr[i];
            }
            size = to - from;
            return newArr;
        }
        return null;
    }
    @Override
    public String toString() {
        return String.format("ArrayList{ arr=%s, capacity=%s, size=%s}" ,Arrays.toString(arr),capacity,size);
    }
}
