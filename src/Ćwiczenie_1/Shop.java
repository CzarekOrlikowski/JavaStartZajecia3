package Ćwiczenie_1;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name = "Czekolada";
        product1.producer.name = "Wedel";
        product1.producer.address.city = "Warszawa";
        product1.producer.address.street = "Zielona";
        product1.producer.address.number = "22";
        product1.price = 2.5;
        product1.availability = true;

        Product product2 = new Product();
        product2.name = "Chleb";
        product2.producer.name = "Familijna";
        product2.producer.address.city = "Krośnice";
        product2.producer.address.number = "34";
        product2.price = 3.5;
        product2.availability = true;

        Product product3 = new Product();
        product3.name = "Wino";
        product3.producer.name = "Żywiec";
        product3.producer.address.city = "Wrocław";
        product3.producer.address.street = "Piwna";
        product3.producer.address.number = "11";
        product3.price = 5.5;
        product3.availability = false;

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