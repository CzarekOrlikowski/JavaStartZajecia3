package Zadanie_5;

public class TVSet {
    boolean status = false;

    void showInfo(){
        System.out.println("Czy telewizot jest włączony: " + status);
    }

    void turnOn (){
        status = true;
    }

    void turnOff (){
        status = false;
    }

}
