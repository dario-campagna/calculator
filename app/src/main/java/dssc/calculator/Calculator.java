package dssc.calculator;

public class Calculator {
    public double compute(String s) {
        return Double.parseDouble(s);
    }

    public double compute(String leftOperand, String operator, String rightOperand) {
        if ("*".equals(operator)) {
            return Double.parseDouble(leftOperand) * Double.parseDouble(rightOperand);
        } else if ("/".equals(operator)) {
            return Double.parseDouble(leftOperand) / Double.parseDouble(rightOperand);
        }
        return Double.parseDouble(leftOperand) + Double.parseDouble(rightOperand);
    }
}
