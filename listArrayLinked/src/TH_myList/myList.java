package TH_myList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class myList<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public myList() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public void setDEFAULT_CAPACITY(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    }

    public  void ensureCaPa(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e){
        if (size == elements.length ) {
            ensureCaPa();
        }
        elements[size++] = e;
    }

    public E get(int index){
        if (index >= size || index < 0 ){
            throw  new IndexOutOfBoundsException("Index: "+index+" Size "+index);
        }
        return (E) elements[index];
    }
}
