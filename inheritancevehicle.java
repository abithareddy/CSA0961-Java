// Vehicle.java
public class Vehicle {
    String licensePlate, owner;

    Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    void displayInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
    }
}

// Car.java
public class Car extends Vehicle {
    int numDoors;

    Car(String licensePlate, String owner, int numDoors) {
        super(licensePlate, owner);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Truck.java
public class Truck extends Vehicle {
    double cargoCapacity;

    Truck(String licensePlate, String owner, double cargoCapacity) {
        super(licensePlate, owner);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

// Motorcycle.java
public class Motorcycle extends Vehicle {
    int engineSize;

    Motorcycle(String licensePlate, String owner, int engineSize) {
        super(licensePlate, owner);
        this.engineSize = engineSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Size: " + engineSize + " cc");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        new Car("ABC123", "John Doe", 4).displayInfo();
        System.out.println();
        new Truck("XYZ789", "Jane Smith", 5.0).displayInfo();
        System.out.println();
        new Motorcycle("DEF456", "Bob Johnson", 650).displayInfo();
    }
}