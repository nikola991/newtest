package Model;

public enum OperationType {

    ADDITION(1),
    SUBSTRACTION(1),
    MULTIPLICATION(2);

    private final int priority;

    OperationType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
