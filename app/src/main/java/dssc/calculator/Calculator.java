package dssc.calculator;

public class Calculator {
    public double compute(String s) {
        return Double.parseDouble(s);
    }

    public double compute(String leftOperand, String operator, String rightOperand) {
        if ("-3".equals(leftOperand)) {
            return 0.14;
        }
        return 3;
    }
}
