package it.uom.cse;

import java.util.Arrays;


public class MathOperation {
    int f1 = 0;
    int f2 = 1;
    int fn;

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int fib(n){
        if (n==1){
            fn=1;
        }
        if(n>=2){
            for (int i=1; i<n; i++){
                fn = f1+f0;
                f0 = f1;
                f1=fn
            }
        }
        return fn;
    }

}
