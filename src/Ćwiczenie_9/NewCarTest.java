package Ćwiczenie_9;

import Ćwiczenie_7.Car;

public class NewCarTest {
    public static void main(String[] args) {

        NewCar newCar1 = new NewCar ("BMW", 150, 140);
        newCar1.showInfo();

        NewCarController newCarController = new NewCarController();
        newCarController.turbo(newCar1);
//        newCarController.speedUp(newCar1, 40);
        newCarController.speedDown(newCar1, 20);
        newCar1.showInfo();
    }
}