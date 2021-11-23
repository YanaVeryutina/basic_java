package guru.qa;

public class HelloWorld {

    boolean aBoolean = false; //*
    char aChar = '|';

    byte aByte = 1;
    short aShort = 1;
    int aInt = 1; //*
    long aLong = 1;
    float aFloat = 1.0F;
    double aDouble = 1.0D; //*

    static class Human {
        int age; //0
        String name; //null

        public void sayName() {
            System.out.println(name);
        }
        public void sayAge() {
            System.out.println(age);
        }
        public void incrementAge() {
            age = age +1;
        }
    }

    //модификатор доступа ||static|| возвращаемое значение - имя - (аргументы)
    public static void main(String[] args) {
        // String message = "HelloWorld!"
        // System.out.println(" HelloWorld!");
        Human yana = new Human();
        yana.name = "Яна";
        yana.age = 24;
        Human vlad = new Human();
        vlad.name = "Влад";
        vlad.age = 25;
        yana.sayName();
        vlad.sayName();

        yana.incrementAge();
        yana.sayAge();
        vlad.sayAge();
    }
}
