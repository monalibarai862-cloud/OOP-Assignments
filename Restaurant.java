class Restaurant {

    boolean foodReady = false;

    synchronized void prepareFood() {
        try {
            System.out.println("Chef prepared food");
            foodReady = true;

            notify(); // notify waiter

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait(); // wait until food is ready
            }

            System.out.println("Waiter served food");
            foodReady = false;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Restaurant obj = new Restaurant();

        Thread chef = new Thread(() -> obj.prepareFood());

        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}
