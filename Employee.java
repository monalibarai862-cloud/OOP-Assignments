import java.util.Scanner;

public class Employee {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        return basic + hra + da;
    }
 
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        ename = sc.next();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        netpay = Calculate(); 
    }

    void dispdata() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.havedata();
        e.dispdata();
    }
}
