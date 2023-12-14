public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Mercedes", 2016);
        Car car = new Car("Audi", 2019, "A4");
        System.out.println(vehicle.displayInfo());
        System.out.println(car.displayInfo());

    }
}
