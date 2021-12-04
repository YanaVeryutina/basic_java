package ya.kor;

public class Phone {

    int weight;
    String model;

    public void sayWeight() {
        System.out.println(weight);
    }

    public void sayModel() {
        System.out.println(model);
    }

    public void incrementWeight() {
               weight = weight + 100;
    }

    public static void main(String[] args) {
        Phone my = new Phone();
        my.model = "iPhone XR";
        my.weight = 204;
        Phone samsung = new Phone();
        samsung.model = "Samsung S7";
        samsung.weight = 150;
        my.sayModel();
        samsung.sayModel();

        my.incrementWeight();
        my.sayWeight();
        samsung.sayWeight();

    }
}


