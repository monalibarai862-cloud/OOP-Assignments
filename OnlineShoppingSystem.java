import java.util.Scanner;

class OnlineShoppingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        Thread payment = new Thread(() -> {
            System.out.println("Processing payment of " + amount + " for " + product + "...");
        });

        Thread order = new Thread(() -> {
            System.out.println("Order confirmed for " + product + "...");
        });

        payment.start();
        order.start();

        sc.close();
    }
}
