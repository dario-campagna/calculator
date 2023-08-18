package dssc.calculator;

public class Calculator {

    public double computeResult(String... expressionLiterals) {
        String leftOperand = expressionLiterals[0];
        if (expressionLiterals.length > 1) {
            String operator = expressionLiterals[1];
            String rightOperand = expressionLiterals[2];
            if ("-".equals(operator)) {
                return Double.parseDouble(leftOperand) - Double.parseDouble(rightOperand);
            } else if ("*".equals(operator)) {
                return Double.parseDouble(leftOperand) *
                        Double
                                .parseDouble(rightOperand);
            } else if ("/".equals(operator)) {
                return Double.parseDouble(leftOperand) / Double.parseDouble(rightOperand);
            }
            return Double.parseDouble(leftOperand) + Double.parseDouble(rightOperand);
        } else {
            return Double.parseDouble(leftOperand);
        }
    }

}
