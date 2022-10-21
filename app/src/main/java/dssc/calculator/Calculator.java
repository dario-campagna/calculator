package dssc.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public double[] compute(String[] args) {
        List<Double> results = new ArrayList<>();
        double intermediateResult = Double.parseDouble(args[0]);
        for (int i = 1; i < args.length; i += 2) {
            intermediateResult = applyOperation(intermediateResult, args[i], Double.parseDouble(args[i + 1]));
            results.add(intermediateResult);
        }
        return results.size() > 0 ? results.stream().mapToDouble(Number::doubleValue).toArray() : new double[]{intermediateResult};
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
