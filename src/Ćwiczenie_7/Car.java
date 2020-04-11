package Ćwiczenie_7;

public class Car {
    String name;
    int power;
    int currentSpeed;

    Car (String n, int p, int s){
        name = n;
        power = p;
        currentSpeed = s;
    }

    void turbo (){
        power = (int)(power * 1.1);
    }

    void speedUp (int speed){
        currentSpeed = currentSpeed + speed;
        currentSpeed += speed;
    }

    void speedDown (int speed){
//        currentSpeed = currentSpeed - speed;
        currentSpeed -= speed;
    }

    void showInfo (){
        System.out.println();
        System.out.println("Auto: " + name);
        System.out.println("Moc: " + power);
        System.out.println("Aktualna prędkość: " + currentSpeed);

    }
}
