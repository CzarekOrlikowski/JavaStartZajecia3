package Ćwiczenie_3;

public class Product {
    String name;
    Producer producer; //pusty obiekt Producer, który można stworzyć również w Shop, podczas tworzenia obiektu Product;
    double price;
    boolean availability;

    Product (String n, double pri, boolean av, Producer prod){
        name = n;
        producer = prod;
        price = pri;
        availability = av;
    }
}
