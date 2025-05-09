import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class c3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No for student " + (i + 1) + ": ");
            int roll = scanner.nextInt();

            System.out.print("Enter Name for student " + (i + 1) + ": ");
            String name = scanner.next();

            System.out.print("Enter CGPA for student " + (i + 1) + ": ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("Details of students:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }

        double lowestCGPA = students[0].getCGPA();
        String lowestCGPAStudent = students[0].getName();

        for (int i = 1; i < n; i++) {
            if (students[i].getCGPA() < lowestCGPA) {
                lowestCGPA = students[i].getCGPA();
                lowestCGPAStudent = students[i].getName();
            }
        }

        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudent);
    }
}
