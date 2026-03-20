// Abstract class
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

// BikeRide class
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5; // ₹5 per km
    }
}

// AutoRide class
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8; // ₹8 per km
    }
}

// CarRide class
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12; // ₹12 per km
    }
}

// Main class
public class RideDemo {
    public static void main(String[] args) {

        // Array of Ride (runtime polymorphism)
        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        // Calculate fares
        for (Ride r : rides) {
            System.out.println("Fare: ₹" + r.calculateFare());
        }
    }
}
