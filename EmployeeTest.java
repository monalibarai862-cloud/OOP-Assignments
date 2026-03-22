class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Rahul", 50000);
        e1.display();
    }
}