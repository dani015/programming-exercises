package shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    double calculateArea() {
        double result = Math.PI * this.radius * this.radius;
        this.setArea(result);

        return result;
    }
}
