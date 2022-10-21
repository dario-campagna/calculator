package dssc.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {

    private static Map<String, BiFunction<Double, Double, Double>> operatorToFunction = new HashMap<>(){{
        put("+", (l, r) -> l + r);
        put("*", (l, r) -> l * r);
        put("-", (l, r) -> l - r);
        put("/", (l, r) -> l / r);
    }};

    public double compute(String s) {
        return Double.parseDouble(s);
    }

    public double compute(String leftOperand, String operator, String rightOperand) {
        double leftOp = Double.parseDouble(leftOperand);
        double rightOp = Double.parseDouble(rightOperand);
        return operatorToFunction.get(operator).apply(leftOp, rightOp);
    }
}
