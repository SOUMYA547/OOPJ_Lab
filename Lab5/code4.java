import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    @Override
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empId = scanner.nextInt();
        System.out.print("Enter employee name: ");
        empName = scanner.next();
    }

    @Override
    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptId = scanner.nextInt();
        System.out.print("Enter department name: ");
        deptName = scanner.next();
    }

    public void displayDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class code4 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}
