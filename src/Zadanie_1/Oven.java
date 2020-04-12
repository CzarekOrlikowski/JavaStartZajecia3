package Zadanie_1;

public class Oven {
    String brand;
    String color;
    int platesNumber;
    boolean steam;

    void showInfo(){
        System.out.println("OPIS PIEKARNIKA");
        System.out.println("Marka : " + brand);
        System.out.println("Kolor: " + color);
        System.out.println("Ilość płyt: " + platesNumber);
        System.out.println("Para: " + steam);
    }
}
