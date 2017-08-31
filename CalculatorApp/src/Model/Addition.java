package Model;

public class Addition extends Operation {

    private double a;
    private double b;

    public Addition(double a, double b) {
        super(OperationType.ADDITION);
        this.a = a;
        this.b = b;
    }

    public double calc() {
        return a + b;
    }
}
