import java.util.List;

public class Swap<T> {
    private T element;

    public Swap(T element){
        this.element = element;
    }

    @Override
    public String toString(){
        return this.element.getClass().getName() + ": " + this.element;
    }
}
