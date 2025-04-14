import java.util.Scanner;

public class Contructor {
    String name;
    int age;
    char section;

    // Constructor with name and age parameters
    public Contructor(String name, int age) {
        this.name = name;
        this.age = age;   
    }
    
    // Overloaded constructor with section parameter
    public Contructor(char section) {
        this.section = section;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if (this.section != '\0') { // Check if section is initialized
            System.out.println("Section: " + this.section);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Contructor[] students = new Contructor[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.println("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter section of student " + (i + 1) + ": ");
            char section = sc.next().charAt(0);
            sc.nextLine();

            // Using both constructors
            students[i] = new Contructor(name, age);
            students[i].section = section;
        }

        System.out.println("\nStudent Information:");
        for (Contructor student : students) {
            student.displayInfo();
        }

//        // Example of using overloaded constructor with just section
//        Contructor studentExample = new Contructor('A');
//        System.out.println("\nExample Student:");
//        studentExample.displayInfo();
    }
}
