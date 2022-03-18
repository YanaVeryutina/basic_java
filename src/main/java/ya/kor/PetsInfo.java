package ya.kor;

public class PetsInfo {

    String name;
    String color;
    int weight;
    int age;



    public void sayCatInfo (){
        System.out.println("My name is " + name + "! " + "Color of my hair is " + color + ". " +
                "I'm " + age + " years old. " + "My weight is " +weight + " kilos.");
    }
    public void setHobbies(){
        if(name.equals("Cris")){
            System.out.println("My hobbies is " + "watching birds.");
        }
        else if (name.equals("Sonya")){
            System.out.println("My hobbies is " + "playing with my toys.");
        }
        else {
            System.out.println("My hobbies is " + "crunch daddy's shoes");
        }
    }


}
