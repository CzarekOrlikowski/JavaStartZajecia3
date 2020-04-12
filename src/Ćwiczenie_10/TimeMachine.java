package Ćwiczenie_10;

public class TimeMachine {

    void backInTime (Person person){
        person.age --;
    }

    void timeTravel (Person person, int step){
        person.age = person.age + step;
    }
}
