package TH_stack;

import java.lang.reflect.Type;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class myGenericStack<T> {
    private LinkedList<T> stack;

    public myGenericStack(){
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }

}
