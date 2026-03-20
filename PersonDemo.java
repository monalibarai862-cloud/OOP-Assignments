class Person {
    void role() {
        System.out.println("I am a Person.");
    }
}

class Employee extends Person {   // ✅ MUST extend Person
    @Override
    void role() {
        System.out.println("I am an Employee.");
    }
}

class Manager extends Employee {  // ✅ extends Employee
    @Override
    void role() {
        System.out.println("I am a Manager.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role();
        p2.role();
        p3.role();
    }
}