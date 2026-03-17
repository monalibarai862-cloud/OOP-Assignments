import java.util.Scanner;

public class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();

        System.out.print("Enter Customer Name: ");
        Name = sc.next();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000) {
            amount = (float)(1.02 * amount); // 2% extra charge
        }

        return amount;
    }

    
    void DispInfo() {
        float amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days of Stay: " + Days);
        System.out.println("Total Amount: " + amount);
    }

    
    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}