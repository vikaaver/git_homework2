public class Vehicle {
    public String brand;
    public int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String displayInfo(){
        return String.format("%s %d", brand, year);
    }
}
