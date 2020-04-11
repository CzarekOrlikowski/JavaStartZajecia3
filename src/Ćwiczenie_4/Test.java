package Ćwiczenie_4;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box(3.0, 4.0, 5.0);
        double boxVolume = box1.length * box1.height * box1.width;

        System.out.println("Skrzynka o rozmiarach:");
        System.out.println("- długość: " + box1.length);
        System.out.println("- wysokość: " + box1.height);
        System.out.println("- szerokość: " + box1.width);
        System.out.println("Objętość skrzynki: " + boxVolume);
    }
}
