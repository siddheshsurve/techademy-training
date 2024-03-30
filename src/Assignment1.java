class Vehicle {
    String manufacturer;
    String model;
    int year;
    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Manufacturer : "+ manufacturer);
        System.out.println("Model : "+ model);
        System.out.println("Year : "+ year);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String bodyStyle;

    public Car(String manufacturer, String model, int year, int seatingCapacity, String bodyStyle) {
        super(manufacturer, model, year);
        this.seatingCapacity = seatingCapacity;
        this.bodyStyle = bodyStyle;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seating Capacity : " + seatingCapacity);
        System.out.println("Body Style : " + bodyStyle);
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Car mycar = new Car("Hyundai", "Creta", 2015, 5, "SUV");
        mycar.displayInfo();
    }
}
