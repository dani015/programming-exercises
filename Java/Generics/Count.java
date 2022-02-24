public class Count<T extends Comparable<T>> implements Comparable<Count<T>>{
    private T element;

    public Count (T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }


    @Override
    public int compareTo(Count<T> other) {
        return this.element.compareTo(other.element);
    }
}
