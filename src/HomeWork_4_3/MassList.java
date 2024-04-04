package HomeWork_4_3;

import java.util.Objects;

public class MassList<E> {
    private Object[] data;
    private int size;

    public MassList() {
        data = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(E element) {
        if (data.length > size-1) {
            ensureCapacity(size + 1);
            data[size++] = element;
        } else {
            data[size++] = element;
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            int newSize = Math.max(data.length * 2, minCapacity);
            Object[] newData = new Object[newSize];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) data[index];
    }

        public E remove(int index) {
        Objects.checkIndex(index, size);
        @SuppressWarnings("unchecked") E oldValue = (E) data[index];
        fastRemove(data, index);
        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            data[i] = null;
    }
}
