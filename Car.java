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