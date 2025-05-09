import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab9MySQL {
    static final String URL = "jdbc:mysql://localhost:3306/your_database";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Display all records\n2. Display record by Roll No\n3. Insert, Update, Delete Record\n4. Display records with column headings\n5. Execute query via GUI");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                displayAllRecords();
                break;
            case 2:
                System.out.print("Enter Roll No: ");
                int rollNo = scanner.nextInt();
                displayRecordByRollNo(rollNo);
                break;
            case 3:
                modifyRecords();
                break;
            case 4:
                displayRecordsWithHeadings();
                break;
            case 5:
                new QueryExecutor();
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }

    public static void displayAllRecords() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getInt("marks"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayRecordByRollNo(int rollNo) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student WHERE rollno = ?")) {
            pstmt.setInt(1, rollNo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getInt("marks"));
            } else {
                System.out.println("Record not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modifyRecords() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter rollno to insert: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
            pstmt.setInt(1, rollNo);
            pstmt.setString(2, name);
            pstmt.setInt(3, marks);
            pstmt.executeUpdate();
            System.out.println("Record inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayRecordsWithHeadings() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= columns; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class QueryExecutor extends JFrame implements ActionListener {
    JTextField queryField;
    JTextArea resultArea;
    JButton executeButton;

    QueryExecutor() {
        setTitle("SQL Query Executor");
        setSize(400, 300);
        setLayout(new FlowLayout());
        
        queryField = new JTextField(30);
        executeButton = new JButton("Execute Query");
        resultArea = new JTextArea(10, 30);
        resultArea.setVisible(false);
        
        add(new JLabel("Enter Query:"));
        add(queryField);
        add(executeButton);
        add(new JScrollPane(resultArea));
        
        executeButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try (Connection conn = DriverManager.getConnection(Lab9MySQL.URL, Lab9MySQL.USER, Lab9MySQL.PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(queryField.getText())) {
            resultArea.setText("");
            while (rs.next()) {
                resultArea.append(rs.getString(1) + "\n");
            }
            resultArea.setVisible(true);
        } catch (SQLException ex) {
            resultArea.setText("Error executing query");
            resultArea.setVisible(true);
        }
    }
}
