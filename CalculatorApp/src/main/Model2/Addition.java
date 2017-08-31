package main.Model2;

public class Addition extends Operator {

    private double a;
    private double b;

    public Addition () {
        super(OperationType.ADDITION);
    }
    public double calc(double a,double... b) {
        double result = a;
        for(double i : b) {
            result += i;
        }
        return result;
    }
}
