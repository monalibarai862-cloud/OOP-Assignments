class ChatApplication {

    public static void main(String[] args) {

        // Sending thread
        Thread sender = new Thread(() -> {
            try {
                System.out.println("Sending message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message sent");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Receiving thread
        Thread receiver = new Thread(() -> {
            try {
                System.out.println("Receiving message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message received");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread lifecycle states
        System.out.println("Sender State (NEW): " + sender.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender State (RUNNABLE): " + sender.getState());

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sender State (TERMINATED): " + sender.getState());
    }
}
