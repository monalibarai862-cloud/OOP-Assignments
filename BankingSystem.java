import java.util.Scanner;

class BankingSystem {

    int balance;
    BankingSystem(int balance) {
        this.balance = balance;
    }

    void withdraw(String user, int amount) {

        synchronized (this) { 

            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);

                balance = balance - amount;

                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankingSystem obj = new BankingSystem(balance);

        System.out.print("Enter amount for User1: ");
        int amt1 = sc.nextInt();

        System.out.print("Enter amount for User2: ");
        int amt2 = sc.nextInt();

        Thread t1 = new Thread(() -> obj.withdraw("User1", amt1));
        Thread t2 = new Thread(() -> obj.withdraw("User2", amt2));

        t1.start();
        t2.start();

        sc.close();
    }
}
