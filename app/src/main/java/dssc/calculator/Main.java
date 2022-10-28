package dssc.calculator;

public class Main {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        if (args.length > 1) {
            System.out.println(calculator.compute(args[0], args[1], args[2]));
        } else {
            System.out.println(calculator.compute(args[0]));
        }
    }
}
