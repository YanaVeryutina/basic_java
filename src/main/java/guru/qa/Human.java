package guru.qa;

public class Human {
    int age; //0
    String name; //null

    public void sayName() {
        System.out.println(name);
    }

    public void sayAge() {
        System.out.println(age);
    }

    public void incrementAge() {
        age = age + 1;
    }
}