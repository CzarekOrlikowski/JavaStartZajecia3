package Ćwiczenie_5;

public class Test {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double multi = calc.multiply(3.0, 4.5, 5.4);
        System.out.println(calc.multiply(3.0, 4.5, 5.4));
        System.out.println(multi);

        calc.subtractAndShow(3,4);
    }
}
