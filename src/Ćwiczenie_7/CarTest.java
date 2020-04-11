package Ćwiczenie_7;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car ("BMW", 150, 140);

        car1.showInfo();
        car1.turbo();
//        car1.speedUp(10);
        car1.speedDown(40);
        car1.showInfo();
    }
}
