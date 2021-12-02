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
                System.out.println(weight);
                weight = weight + 100;
        }

        public static void main(String[] args) {
            Phone phone = new Phone();
            phone.model = "iPhone XR";
            phone.weight = 204;
            Phone samsung = new Phone();
            samsung.model = "Samsung S7";
            samsung.weight = 150;
            phone.sayModel();
            samsung.sayModel();

            phone.incrementWeight();
            phone.sayWeight();
            samsung.sayWeight();

        }
}


