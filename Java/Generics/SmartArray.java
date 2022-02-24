import java.util.Arrays;
import java.util.Comparator;

public class SmartArray<E extends Number>{

    private static final int INITIAL_CAPACITY = 4;
    private Object[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new Object[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(E element) {
        if(this.size == this.capacity) {
            this.resize();
        }

        this.data[this.size++] = element;
    }


    public void sort(Comparator<E> comparator) {
        Arrays.sort((E[]) this.data, 0, this.size, comparator);
    }

    public E get (int index) {
        validateIndex(index);

        return (E) this.data[index];
    }



    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if(this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    private void validateIndex(int index) {
    }

    private void resize() {
    }

}
