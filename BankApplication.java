class BankApplication {

    static void checkBalance(int balance) throws Exception {
        if (balance < 1000) {
            throw new Exception("Minimum balance not maintained");
        } else {
            System.out.println("Balance is sufficient");
        }
    }

    public static void main(String[] args) {

        try {
            checkBalance(500);   
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
