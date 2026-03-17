import java.util.Scanner;

public class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();
        System.out.print("Enter Car Type (Small / Van / SUV): ");
        CarType = sc.next();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type!");
        }
        return Rent;
    }

    void ShowCar() {
        System.out.println("\nCar ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL car = new CARRENTAL();
        car.GetCar();
        car.GetRent();
        car.ShowCar();
    }
}