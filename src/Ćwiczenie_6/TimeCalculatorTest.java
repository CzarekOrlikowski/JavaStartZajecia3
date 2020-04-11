package Ćwiczenie_6;

public class TimeCalculatorTest {
    public static void main(String[] args) {

        TimeCalculator calculation = new TimeCalculator();

        int howMuchHours = calculation.hours(20);
        System.out.println(howMuchHours);

        int howMuchSeconds = calculation.seconds(20, 13, 34, 34);
        System.out.println(howMuchSeconds);

        double howMuchMinutes = calculation.minutes(1000);
        System.out.println(howMuchMinutes);

    }
}
