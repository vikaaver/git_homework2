public class Car extends Vehicle{
    public String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }
    public String toString() {
        return String.format("%s %s %d", brand, model, year);
    }
    public String displayInfo() {
        super.displayInfo();
        return String.format("%s %s %d", brand, model, year);

    }
}
