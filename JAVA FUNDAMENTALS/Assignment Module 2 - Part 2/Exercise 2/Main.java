class Calculator {
    int a = 3;
    int b = 5;

    public int addition() {
        return a + b;
    }
    public int subtraction() {
        return a - b;
    }
    public int multiplication() {
        return a * b;
    }
    public double division() {
        return (double) a / b;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.addition());
        System.out.println("Subtraction: " + calc.subtraction());
        System.out.println("Multiplication: " + calc.multiplication());
        System.out.println("Division: " + calc.division());
    }
} 