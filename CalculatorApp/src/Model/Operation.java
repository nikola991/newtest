package Model;

public abstract class Operation {

    private final OperationType operationType;
    private final int priority;

    protected Operation(OperationType operationType) {
        this.operationType = operationType;
        priority = operationType.getPriority();
    }

    public abstract double calc();

    public OperationType getOperationType() {
        return operationType;
    }

    public int getPriority() {
        return priority;
    }
}

