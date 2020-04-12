package Ćwiczenie_9;

public class NewCarController {

    void turbo (NewCar newCar){
       newCar.power = (int)(newCar.power * 1.1);
    }

    void speedUp (NewCar newCar, int speed){
        newCar.currentSpeed += speed;
    }

    void speedDown (NewCar newCar, int speed){
        newCar.currentSpeed -= speed;
    }
}
