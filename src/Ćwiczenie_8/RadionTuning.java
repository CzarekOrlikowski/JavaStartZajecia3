package Ćwiczenie_8;

public class RadionTuning {
    public static void main(String[] args) {

        Radio radio1 = new Radio (10, 150);
        radio1.radioInfo();
        System.out.println();

        radio1.setVolumeDown(3);
        radio1.radioInfo();
        System.out.println();

        radio1.setVolumeUp(6);
        radio1.setAMStation();
        radio1.radioInfo();
        System.out.println();


    }
}
