public class EmployeeCountDemo {

    static int employeeCount = 0; 

    String name;
    int id;
    EmployeeCountDemo(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }
    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeCountDemo e1 = new EmployeeCountDemo("Anushka", 101);
        EmployeeCountDemo e2 = new EmployeeCountDemo("Rahul", 102);
        EmployeeCountDemo e3 = new EmployeeCountDemo("Priya", 103);
        EmployeeCountDemo.showCount();
    }
}
