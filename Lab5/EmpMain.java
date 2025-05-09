import java.util.Scanner;

class Employee {
    protected int empId;
    private String empName;

    public void setDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Sales extends Employee {
    public double tAllowance(double totalEarnings) {
        return 0.05 * totalEarnings;
    }
}

public class EmpMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sales salesPerson = new Sales();

        System.out.print("Enter the employee id: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        salesPerson.setDetails(empId, empName);

        double totalEarnings = salesPerson.earnings(basicSalary);
        double tAllowance = salesPerson.tAllowance(totalEarnings);

        System.out.println("The emp id of the employee is " + salesPerson.getEmpId());
        System.out.println("The total earning is " + totalEarnings);
    }
}
