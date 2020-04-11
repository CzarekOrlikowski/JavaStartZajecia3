package Ćwiczenie_6;

import java.io.PrintStream;
import java.sql.SQLOutput;

public class TimeCalculator {

    int hours (int days){
        return 24 * days;
    };

    int seconds (int days, int hours, int minutes, int seconds){
        int secondsFromDays = 86400 * days;
        int secondsFromHours = 3600 * hours;
        int secondsFromMinutes = 60 * minutes;
        System.out.printf("%d dni, %d godzin, %d minut, %d sekund to: ", days, hours, minutes, seconds);
        return secondsFromDays + secondsFromHours + secondsFromMinutes + seconds;
    }

    double minutes (int seconds){
        double minutesFromSeconds = seconds / 60.0;
        return minutesFromSeconds;
    }
}
