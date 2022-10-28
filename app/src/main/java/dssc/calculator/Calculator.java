package dssc.calculator;

public class Calculator {
    public double compute(String number) {
        return Double.parseDouble(number);
    }

    public double compute(String leftOperand, String operator, String rightOperand) {
        return Double.parseDouble(leftOperand) + Double.parseDouble(rightOperand);
    }
}
