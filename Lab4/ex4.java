import java.util.*;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number : ");
        acc_no = sc.nextInt();
        System.out.print("Enter balance : ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account number : " + acc_no + "\nBalance : " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter aadhar number : ");
        aadhar_no = sc.nextLong();
    }

    void disp() {
        super.disp();
        System.out.println("Name : " + name + "\nAadhar number : " + aadhar_no);
    }
}

class ex4 {
    public static void main(String args[]) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.input();
        p2.input();
        p3.input();
        p1.disp();
        p2.disp();
        p3.disp();
    }
}