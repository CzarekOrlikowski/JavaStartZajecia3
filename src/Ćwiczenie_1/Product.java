package Ćwiczenie_1;

public class Product {
    String name;
    Producer producer = new Producer(); //pusty obiekt Producer, który można stworzyć również w Shop, podczas tworzenia obiektu Product
    double price;
    boolean availability;
}
