package rectangle;

public class Square extends Rectangle {
    Square(int a) {
       super(a, a);
    }

    @Override
    public int area() {
        return this.getA() * this.getA();
    }
}
