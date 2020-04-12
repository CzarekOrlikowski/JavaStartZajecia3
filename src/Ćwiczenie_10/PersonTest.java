package Ćwiczenie_10;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", 45);
        person1.showInfo();

        TimeMachine change = new TimeMachine();
        change.backInTime(person1);
//        change.backInTime(person1);
//        change.backInTime(person1);
        person1.showInfo();

        change.timeTravel(person1, -10);
        person1.showInfo();

    }
}
