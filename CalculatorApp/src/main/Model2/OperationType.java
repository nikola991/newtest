package main.Model2;

public enum OperationType {
    ADDITION(1),
    SUBSTRACTION(1),   //enum se objekti, i tie se konstanti ograniceni mozni vrednosti, no moze i da nosat vrednosti vo niv
    MULTIPLICATION(2);  // poradi sto treba da se napravi override na konstruktor

    private final int priority;

     OperationType(int priority) {  //konstruktor zatoa za da se dade dopolnitelna vrednost na instance variable
        this.priority = priority;
    }
    public int getPriority() {   // get method za da se zeme od objektot dopolnitelna vrednost
        return priority;
    }
}
