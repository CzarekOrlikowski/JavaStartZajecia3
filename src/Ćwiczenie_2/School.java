package Ćwiczenie_2;

public class School {
    public static void main(String[] args) {

        PupilGrades pupilGrades1 = new PupilGrades();
//        pupilGrades1.pupil = new Pupil();
        pupilGrades1.pupil.firstName = "Tomek";
        pupilGrades1.pupil.lastName = "Zielonka";
        pupilGrades1.pupil.sex = 'M';
//        pupilGrades1.pupil.location = new Address();
        pupilGrades1.pupil.location.city = "Warszawa";
        pupilGrades1.pupil.location.street = "Zielona";
        pupilGrades1.pupil.location.number = "33A";
        pupilGrades1.maths = 4.5;
        pupilGrades1.IT = 5.0;
        pupilGrades1.physics = 3.0;

        PupilGrades pupilGrades2 = new PupilGrades();
//        pupilGrades2.pupil = new Pupil();
        pupilGrades2.pupil.firstName = "Janek";
        pupilGrades2.pupil.lastName = "Czerwonka";
        pupilGrades2.pupil.sex = 'M';
//        pupilGrades2.pupil.location = new Address();
        pupilGrades2.pupil.location.city = "Wrocław";
        pupilGrades2.pupil.location.street = "Biała";
        pupilGrades2.pupil.location.number = "398";
        pupilGrades2.maths = 5.5;
        pupilGrades2.IT = 4.0;
        pupilGrades2.physics = 3.5;

        Double averagePupil1 = (pupilGrades1.maths + pupilGrades1.IT + pupilGrades1.physics)/3;
        Double averagePupil2 = (pupilGrades2.maths + pupilGrades2.IT + pupilGrades2.physics)/3;

        Double averageMaths = (pupilGrades1.maths + pupilGrades2.maths)/2;
        Double averageIT = (pupilGrades1.IT + pupilGrades2.IT)/2;
        Double averagePhysics = (pupilGrades1.physics + pupilGrades2.physics)/2;

        System.out.printf("srednia " + pupilGrades1.pupil.firstName + " " + pupilGrades1.pupil.lastName + ": %.2f\n", averagePupil1);
        System.out.printf("srednia " + pupilGrades2.pupil.firstName + " " + pupilGrades2.pupil.lastName + ": %.2f\n", averagePupil2);
        System.out.println("srednia z matematyki: " + averageMaths);
        System.out.println("srednia z IT: " + averageIT);
        System.out.println("srednia z fizyki: " + averagePhysics);
    }
}
