package Ćwiczenie_5;

public class Calculator {

    double multiply (double a, double b, double c){
        double result = a * b * c;
        return result;
// całość ciała metody może być tylko"return a * b * c"
    }

    void subtractAndShow (int a, int b){
        int sub = subtract(a, b);
        System.out.println(sub);
    }

    int subtract (int a, int b){
        return a - b;
    }
}
