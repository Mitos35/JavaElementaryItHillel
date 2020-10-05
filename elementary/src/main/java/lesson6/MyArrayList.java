package lesson6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {

    private Object[] elements;
    private int index;
    private int size;
    private final int CAPACITY = 10;

    public MyArrayList() {
        this.elements = new Object[CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean isContains = false;
        for (Object value : elements) {
            if (o.equals(value)){
                isContains = true;
            }
        }
        return isContains;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (index == elements.length) {
            growArray();
        }
        elements[index] = o;
        index++;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])){
                remove(i);
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > elements.length) {
            System.out.println("Invalid index");
        }
        return elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index > elements.length) {
            System.out.println("Invalid index");
        }
        elements[index] = element;
        return elements;
    }

    @Override
    public void add(int index, Object element) {
        if (index == elements.length) {
            growArray();
        }
        System.arraycopy(elements, index, elements, index + 1, this.index - index);
        elements[index] = element;
        index++;
        size++;
    }

    @Override
    public Object remove(int index) {
        try {
            System.arraycopy(elements, index + 1, elements, index, this.index - index);
            size--;
            index--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
            e.printStackTrace();
        }
        return elements;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private void growArray() {
        Object[] newArray = new Object[(elements.length * 3) /2 + 1];
        System.arraycopy(elements, 0, newArray, 0, index);
        elements = newArray;
    }
}
