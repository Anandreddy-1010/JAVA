class Car {
    String model;
    int year;
    double price;
    String type;

    Car(String model, int year, double price, String type) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, 25000.0, "Sedan");
        car1.display();
    }
}
