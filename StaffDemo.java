// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Doctor class
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor treats patients.");
    }
}

// Nurse class
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse assists doctors and cares for patients.");
    }
}

// Receptionist class
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist manages appointments and records.");
    }
}

// Main class
public class StaffDemo {
    public static void main(String[] args) {

        // Runtime polymorphism
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
