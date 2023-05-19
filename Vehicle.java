public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); // Invoking superclass constructor to initialize the brand
        this.model = model;
    }

    public void displayInfo() {
        super.displayInfo(); // Accessing the superclass version of displayInfo()
        System.out.println("Model: " + model);
    }
}
