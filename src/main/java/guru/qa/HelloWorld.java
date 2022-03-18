package guru.qa;

public class HelloWorld {



    //модификатор доступа ||static|| возвращаемое значение - имя - (аргументы)
    public static void main(String[] args) {

        Human yana = new Human();
        yana.name = "Яна";
        yana.age = 25;
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
