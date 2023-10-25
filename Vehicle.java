
class Vehicle {
    public static void main (String args[]){
        
    }
     String make;
     String model;
     int year;
     int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving");
    }

    // Getters and setters (optional)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Car is driving");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Bike is driving");
    }
}

 class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 150);
        Bike bike = new Bike("Honda", "CBR500R", 2023, 120);

        System.out.println("Car Attributes:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Maximum Speed: " + car.getMaximumSpeed());
        
        System.out.println("\nBike Attributes:");
        System.out.println("Make: " + bike.getMake());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year: " + bike.getYear());
        System.out.println("Maximum Speed: " + bike.getMaximumSpeed());

        car.drive();
        bike.drive();
    }
}
