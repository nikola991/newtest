package main;
import main.Model2.Operato;
import main.Model2.Addition;
import main.Model2.Multiplication;
import main.Model2.Substraction;

import java.util.*;

public class CalculatorMain {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Addition add = new Addition();
        Substraction sub = new Substraction();
        Multiplication mult = new Multiplication();
        Operato [] ope = Operato.values();
        for(Operato i : ope) {
            System.out.println(i.toString());
        }


      // ok pravam mala promena na prokeott da vidime dali kej ja dade 
        while (true) {

            double result = 0;
            char op = '\0';
            double num = 0;
            double num2 = 0;


            num = in.nextDouble();
            System.out.print(num);

            while (true) {

                op = in.next().charAt(0);
                System.out.print(op);
                if (op == '=') {
                    break;
                }
                num2 = in.nextDouble();
                System.out.println(num2);
                switch(op) {
                    case '+' :
                        result = add.calc(num,num2,2.3);
                        break;
                    case '-' :
                        result = sub.calc(num,num2);
                        break;
                    case '*' :
                        result = mult.calc(num,num2);
                        break;

                    default :
                        System.out.println("Invalid expression");
                        break;
                }

                System.out.println(result);
                num = result;
            }

            System.out.println(result);
        }
    }
}

