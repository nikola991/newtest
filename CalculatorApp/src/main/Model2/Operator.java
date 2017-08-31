package main.Model2;

public abstract class Operator {

    private final OperationType operationType;
    private final int priority;

    protected Operator (OperationType operationType) {
        this.operationType = operationType;
        priority = operationType.getPriority();
    }

    public abstract double calc (double a,double... b);
}
