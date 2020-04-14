package Zadanie_3;
import static java.lang.Math.*; // Aby nie pisać 3,14.

public class Calculations {

    boolean isEven (int number){
//      boolean result = (number % 2 == 0);
        System.out.print("Czy liczba " + number + " jest parzysta: " );
        return number % 2 == 0;
    }

    boolean isOdd (int number){
        System.out.print("Czy liczba " + number + " jest nieparzysta: " );
        return number % 2 != 0;
//        return !isEven(number);
//        Wywołanie z negacją metody sprawdzania parzystości jest zgrabniejsze,
//        ale nie pasuje mi do komunikatów, które wyświetlam w ramach metody main.
    }

    double circleField (double radius){
        System.out.print("Pole koła o promieniu " + radius + " to: " );
        return PI * (radius * radius);
    }

    double power (int number){
        System.out.print("Pierwiastek kwadratowy liczby " + number + " to " );
        return sqrt (number);
    }
}
