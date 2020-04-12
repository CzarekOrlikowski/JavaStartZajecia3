package Ćwiczenie_10;

public class Person {
        String firstName;
        String lastName;
        int age;

        Person (String fN, String lN, int a){
            firstName = fN;
            lastName = lN;
            age = a;
        }

        void showInfo(){
            System.out.println("Imię: " + firstName + " Nazwisko: " + lastName + " Wiek: " + age);
        }
        
}
