package shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }
}
