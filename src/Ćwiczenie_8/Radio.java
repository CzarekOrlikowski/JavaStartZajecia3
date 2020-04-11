package Ćwiczenie_8;

public class Radio {
    String station = "FM";
    int volume;
    int frequency;

    Radio (int v, int f){
        volume = v;
        frequency = f;
    }

    void setFrequencyUp (){
        frequency += 1;
//        frequency ++;
    }

    void setFrequencyDown (){
        frequency -= 1;
//        frequency --;
    }

    void setVolumeUp (int up){
        volume = volume + up;
    }

    void setVolumeDown (int down){
        volume = volume - down;
    }

    void setAMStation (){
         station = "AM";
    }

    void setFMStation () {
        station = "FM";
    }
        void radioInfo (){
        System.out.println(station);
        System.out.println(frequency);
        System.out.println(volume);
    }
}
