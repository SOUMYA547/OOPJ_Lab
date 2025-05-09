import java.util.Scanner;

interface Salary {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements Salary {
    @Override
    public double earnings(double basic) {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic;
    }

    @Override
    public double bonus(double basic) {
        return 0;
    }
}

class Substaff extends Manager {
    @Override
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff();
        System.out.println("Earnings - " + substaff.earnings(basicSalary));
        System.out.println("Deduction - " + substaff.deductions(basicSalary));
        System.out.println("Bonus - " + substaff.bonus(basicSalary));
    }
}
