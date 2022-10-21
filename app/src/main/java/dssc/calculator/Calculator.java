package dssc.calculator;

public class Calculator {

    public double compute(String... args) {
        if (operatorIsPresent(args)) {
            return applyOperation(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2]));
        } else {
            return Double.parseDouble(args[0]);
        }
    }

    private static boolean operatorIsPresent(String[] args) {
        return args.length > 1;
    }

    private static Double applyOperation(double leftOperand, String operator, double rightOperand) {
        return switch (operator) {
            case "+" -> leftOperand + rightOperand;
            case "*" -> leftOperand * rightOperand;
            case "-" -> leftOperand - rightOperand;
            default -> leftOperand / rightOperand;
        };
    }

}
