class RailwayReservation {

    int seats = 1; // available seats

    // Synchronized method to avoid double booking
    synchronized void bookTicket(String passenger) {
        if (seats > 0) {
            System.out.println(passenger + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(passenger + ": No tickets available");
        }
    }

    public static void main(String[] args) {

        RailwayReservation obj = new RailwayReservation();

        // Create threads
        Thread t1 = new Thread(() -> obj.bookTicket("Passenger 1"));
        Thread t2 = new Thread(() -> obj.bookTicket("Passenger 2"));

        // Start threads
        t1.start();
        t2.start();
    }
}
