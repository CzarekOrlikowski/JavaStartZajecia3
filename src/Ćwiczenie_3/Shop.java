package Ćwiczenie_3;

public class Shop {
    public static void main(String[] args) {

        Address address1 = new Address("Warszawa", "Zielona", "22");
        Producer producer1 = new Producer("Wedel", address1);
        Product product1 = new Product("Czekolada", 2.5, true, producer1);

        Address address2 = new Address("Krośnice", null, "34");
        Producer producer2 = new Producer("Familijna", address2);
        Product product2 = new Product("Chleb", 3.5, true, producer2);

        Address address3 = new Address("Żywiec", "Piwna", "11");
        Producer producer3 = new Producer("Żywiec", address3);
        Product product3 = new Product("Piwo", 2.5, false, producer3);

        System.out.println("nazwa: " + product1.name
                + ", cena: " + product1.price
                + "zł, producent: " + product1.producer.name
                + ", dostępność: " + product1.availability);

        System.out.println("nazwa: " + product2.name
                + ", cena: " + product2.price
                + "zł, producent: " + product2.producer.name
                + ", dostępność: " + product2.availability);

        System.out.println("nazwa: " + product3.name
                + ", cena: " + product3.price
                + "zł, producent: " + product3.producer.name
                + ", dostępność: " + product3.availability);

        System.out.println(product1.producer.address.city);
        System.out.println(product1.producer.address.street);
        System.out.println(product1.producer.address.number);
    }
}