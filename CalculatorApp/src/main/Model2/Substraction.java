package main.Model2;

public class Substraction extends Operator {
    private double a;
    private double [] b;

    public Substraction() {
        super(OperationType.SUBSTRACTION);
    }

    public double calc(double a, double... b) {

        double result = a;
        for (double i : b) {
            result -= i;
        }
        return result;
    }
}
