class Employee {
    String name;
    double salary;

    // Constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        // Creating object
        Employee e1 = new Employee("Rahul", 50000);

        // Displaying details
        e1.display();
    }
}