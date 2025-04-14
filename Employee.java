import java.util.Scanner;

public class Employee {
    String employeeName;
    String department;
    String hrName;
    double salary;
    int id;
    String creditName;

   
    public Employee(String employeeName, String department, int id, String hrName, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.id = id;
        this.hrName = hrName;
        this.salary = salary;
    }

    
    public Employee(String employeeName, String department, int id, String hrName, double salary, String creditName) {
        this(employeeName, department, id, hrName, salary); // Reuse the main constructor
        this.creditName = creditName;
    }

    
    public void displayInfo() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Department: " + this.department);
        System.out.println("ID: " + this.id);
        System.out.println("HR Name: " + this.hrName);
        System.out.println("Salary: " + this.salary);
        if (this.creditName != null) {
            System.out.println("Credit Card Number: " + this.creditName);
        }
    }

   
    public void displayInfo(boolean brief) {
        if (brief) {
            System.out.println("Employee Name: " + this.employeeName);
            System.out.println("Department: " + this.department);
        } else {
            displayInfo();
        }
    }

   
    public void displayInfo(int id) {
        if (this.id == id) {
            displayInfo();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name for Employee " + (i + 1) + ": ");
            String employeeName = sc.nextLine();

            System.out.println("Enter department for Employee " + (i + 1) + ": ");
            String department = sc.nextLine();

            System.out.println("Enter ID for Employee " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter HR name for Employee " + (i + 1) + ": ");
            String hrName = sc.nextLine();

            System.out.println("Enter salary for Employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Does this employee have a credit card? (yes/no): ");
            String hasCreditCard = sc.nextLine();

            if (hasCreditCard.equalsIgnoreCase("yes")) {
                System.out.println("Enter credit card number for Employee " + (i + 1) + ": ");
                String creditName = sc.nextLine();
                employees[i] = new Employee(employeeName, department, id, hrName, salary, creditName);
            } else {
                employees[i] = new Employee(employeeName, department, id, hrName, salary);
            }
        }

        System.out.println("\nEmployee Information:");
        for (Employee employee : employees) {
            employee.displayInfo(true);
            System.out.println();
        }

        System.out.println("Enter an ID to display full information: ");
        int searchId = sc.nextInt();

        System.out.println("\nDetails of Employee with ID " + searchId + ":");
        for (Employee employee : employees) {
            employee.displayInfo(searchId);
        }
    }
}
