package Model;

public class Multiplication extends Operation {

    private double a;
    private double b;

    public Multiplication(double a,double b) {
        super(OperationType.MULTIPLICATION);
        this.a = a;
        this.b = b;
    }

    public  double calc() {
        return a*b;
    }
}
