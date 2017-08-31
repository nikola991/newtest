package main.Model2;

public enum Operato {

   addition('+'), substraction('-'), multiplication('*');
   private char operator;

    Operato(char operator) {
        System.out.println(this.toString());
        this.operator = operator;

   }
   public char getOperator() {
        return operator;

   }
}
