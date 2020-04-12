package Zadanie_1;

public class OvenTest {
    public static void main(String[] args) {

        Oven oven1 = new Oven();
        oven1.brand = "Bosch";
        oven1.color = "czarny";
        oven1.platesNumber = 4;
        oven1.steam = true;

        Oven oven2 = new Oven();
        oven2.brand = "Amica";
        oven2.color = "biały";
        oven2.platesNumber = 5;
        oven1.steam = false;

        oven1.showInfo();
        oven2.showInfo();
    }
}
