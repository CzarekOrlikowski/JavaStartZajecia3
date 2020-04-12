package Ćwiczenie_9;

public class NewCar {
        String name;
        int power;
        int currentSpeed;

        NewCar (String n, int p, int s){
            name = n;
            power = p;
            currentSpeed = s;
        }

            void showInfo (){
            System.out.println();
            System.out.println("Auto: " + name);
            System.out.println("Moc: " + power);
            System.out.println("Aktualna prędkość: " + currentSpeed);

        }
}
