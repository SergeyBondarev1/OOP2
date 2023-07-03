

public class Main {

    public static void main(String[] args) {
        {
            Car car = new Car("BMW 525", 4);
            Car car2 = new Car("Audi A 4", 4);
            Truck truck = new Truck("MERCEDES", 6);
            Truck truck2 = new Truck("RENO", 8);
            Bicycle bicycle = new Bicycle("OSKAR", 2);
            Bicycle bicycle2 = new Bicycle("Mongoose", 2);
            ServiceStation station = new ServiceStation();
            station.check(car2);
        }
    }
}