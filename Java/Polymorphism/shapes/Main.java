package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape rect1 = new Rectangle(3, 4);
        Rectangle rect2 = new Rectangle(5, 6);
        Shape circ1 = new Circle(5);
        Shape circ2 = new Circle(6);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(rect1);
        shapes.add(circ1);
        shapes.add(rect2);
        shapes.add(circ2);

        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
