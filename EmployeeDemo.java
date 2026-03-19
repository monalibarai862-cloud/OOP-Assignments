abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return 0.20 * salary; 
    }
}
class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return 0.10 * salary + incentive; // 10% + incentive
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Manager("Anushka", 101, 50000);
        Employee e2 = new Developer("Rahul", 102, 40000, 5000);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
