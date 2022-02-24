package problem3;

public class PrimitiveCalculator {
    private char operator = '+';

    public void changeStrategy(char operator) {
        this.operator = operator;
    }

    public void performCalculation(int firstOperand, int secondOperand) {
        if(this.operator == '/') {
            System.out.println(firstOperand / secondOperand);
        }
        if(this.operator == '*') {
            System.out.println(firstOperand * secondOperand);
        }
        if(this.operator == '+') {
            System.out.println(firstOperand + secondOperand);
        }
        if(this.operator == '-') {
            System.out.println(firstOperand - secondOperand);
        }

    }
}
