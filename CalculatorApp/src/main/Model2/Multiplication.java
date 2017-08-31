package main.Model2;

public class Multiplication extends Operator {

    private double a;
    private double b;

    public Multiplication() {
        super(OperationType.MULTIPLICATION);
    }

    public double calc(double a, double... b) {
        double result = a;
        for (double i : b) {
            result *= i;
        }
        return result;
    }
}
