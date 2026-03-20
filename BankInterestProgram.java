public class BankInterestProgram {

    // Bank class
    static class Bank {
        final double interestRate = 5.0; // fixed interest rate

        double calculateInterest(double amount) {
            return (amount * interestRate) / 100;
        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();

        double customer1 = 10000;
        double customer2 = 20000;
        double customer3 = 5000;

        System.out.println("Interest for Customer 1: ₹" + bank.calculateInterest(customer1));
        System.out.println("Interest for Customer 2: ₹" + bank.calculateInterest(customer2));
        System.out.println("Interest for Customer 3: ₹" + bank.calculateInterest(customer3));
    }
}
