package Zadanie_4;

public class Shop {
    public static void main(String[] args) {

        Category category1 = new Category("Słodycze", "produkty na poprawę nastroju");
        Category category2 = new Category("Słone przekąski", "do schrupania podczas ogłądania");

        Product product1 = new Product("Czekolada", 3.5, "czekolada mleczna", category1);
        Product product2 = new Product("Galaretki", 4.5, "galaretki owocowe", category1);
        Product product3 = new Product("Paluszki", 2.5, "paluszki słone", category2);
        Product product4 = new Product("Sok",4.0,"sok owocowy", null);

        SpecialOffer specialOffer1 = new SpecialOffer(product2, "Wiosenna wyprzedaż", "od 14 do 20 kwietnia", 0.2);

        System.out.println("STANDARDOWA OFERTA");

        System.out.println(product1.name + " (" + product1.description + ") " + "cena " + product1.price + " zł" +
                " kategoria: " + product1.group.productType + " (" + product1.group.information + ")");
        System.out.println(product2.name + " (" + product2.description + ") " + "cena " + product2.price + " zł" +
                " kategoria: " + product2.group.productType + " (" + product2.group.information + ")");
        System.out.println(product3.name + " (" + product3.description + ") " + "cena " + product3.price + " zł" +
                " kategoria: " + product3.group.productType + " (" + product3.group.information + ")");
        System.out.println(product4.name + " (" + product4.description + ") " + "cena " + product4.price + " zł");

        System.out.println("OFERTA SPECJALNA");

        System.out.println(specialOffer1.product.name + " (" + specialOffer1.product.description + ") " + "cena pai"
                + product1.price * (1.0 - specialOffer1.discount) + " zł" + " kategoria: " + specialOffer1.product.group.productType + " ("
                + specialOffer1.product.group.information + ")");

    }
}
