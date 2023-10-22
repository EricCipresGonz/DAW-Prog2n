package Genericos.EX_02;

class StackArray<T> {
    private Object[] array;
    private int size;

    public StackArray() {
        array = new Object[10];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Está vacío");
            return null;
        }

        T firstItem = getFirst();

        System.arraycopy(array, 1, array, 0, size - 1);
        size--;

        return firstItem;
    }

    public T getFirst() {
        if (isEmpty()) {
            System.out.println("Está vacío");
            return null;
        }

        return (T) array[0]; 
    }

    public void add(T element) {
        if (size >= array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 1, size);
            array = newArray;
        }

        System.arraycopy(array, 0, array, 1, size);
        array[0] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}