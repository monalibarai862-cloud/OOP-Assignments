import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() <= 2) {
            System.out.println("Masked Password: " + password);
        } else {
            
            String lastTwo = password.substring(password.length() - 2);

            String maskedPart = password.substring(0, password.length() - 2)
                                        .replaceAll(".", "*");

            String maskedPassword = maskedPart + lastTwo;

            System.out.println("Masked Password: " + maskedPassword);
        }

        sc.close();
    }
}
