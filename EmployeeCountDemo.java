public class EmployeeCountDemo {

    static int employeeCount = 0; // static variable

    String name;
    int id;

    // Constructor
    EmployeeCountDemo(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increment count
    }

    // Static method to display count
    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {

        // Creating objects
        EmployeeCountDemo e1 = new EmployeeCountDemo("Anushka", 101);
        EmployeeCountDemo e2 = new EmployeeCountDemo("Rahul", 102);
        EmployeeCountDemo e3 = new EmployeeCountDemo("Priya", 103);

        // Display total employees
        EmployeeCountDemo.showCount();
    }
}
