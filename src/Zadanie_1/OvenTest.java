package Zadanie_1;

public class OvenTest {
    public static void main(String[] args) {

        Oven oven1 = new Oven("Bosch", "czarny", 4, true);
        Oven oven2 = new Oven("Amica", "biały", 5, false);

        oven1.showInfo();
        oven2.showInfo();
    }
}
