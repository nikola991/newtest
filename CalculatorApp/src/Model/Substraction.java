package Model;

public class Substraction extends Operation {

    private double a;
    private double b;

    public Substraction(double a, double b) {
        super(OperationType.SUBSTRACTION);
        this.a = a;
        this.b = b;
    }

    public  double calc() {
        return a-b;
    }
}
