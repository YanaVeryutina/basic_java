package ya.kor;

public class MyPets {

    public static void main(String args[]) {

        PetsInfo cat1 = new PetsInfo();
        PetsInfo cat2 = new PetsInfo();
        PetsInfo dog = new PetsInfo();

        cat1.name = "Cris";
        cat1.color = "Black with white tie";
        cat1.age = 3;
        cat1.weight = 5;

        cat2.name = "Sonya";
        cat2.color = "Black";
        cat2.age = 2;
        cat2.weight = 3;

        dog.name = "Light";
        dog.color = "White with brown spots";
        dog.age = 1;
        dog.weight = 10;

        cat1.sayCatInfo();
        cat1.setHobbies();
        cat2.sayCatInfo();
        cat2.setHobbies();
        dog.sayCatInfo();
        dog.setHobbies();
    }


}
