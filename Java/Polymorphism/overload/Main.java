package overload;

public class Main {
    public static int add(int a, int b) {
        return  a + b;
    }

    public static int add(int a, int b, int c){
        return add(a, b) + c;
    }

    public static double add(double first, double second, int divisor) {
        return (first + second) / divisor;
    }

    public static double add(int first, double second, double multiplier) {
        return (first + second) * multiplier;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 3, 4));
        System.out.println(add(4, 5));
    }
}
