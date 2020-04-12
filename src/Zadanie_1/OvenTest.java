package Zadanie_1;

public class OvenTest {
    public static void main(String[] args) {

        Oven oven1 = new Oven();
        oven1.brand = "Bosch";
        oven1.color = "czarny";
        oven1.platesNumber = 4;
        oven1.steam = true;

        oven1.showInfo();
    }
}
