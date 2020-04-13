package Zadanie_5;

public class TVSetTest {
    public static void main(String[] args) {

        TVSet tvSet1 = new TVSet();
        tvSet1.showInfo();

        tvSet1.turnOn();
        tvSet1.showInfo();

        tvSet1.turnOff();
        tvSet1.showInfo();
    }
}
