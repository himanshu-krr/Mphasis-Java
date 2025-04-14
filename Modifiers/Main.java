package Modifiers;

//Abstract class
abstract class Person {
 public String firstName = "John";
 public int age = 24;

 // Abstract method
 public abstract void study();
}

//Subclass inheriting from the abstract class
class Student extends Person {
 public int graduationYear = 2023;

 // Providing the body for the abstract method
 public void study() {
     System.out.println("Studying all day long");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Creating an object of the Student class
     Student myStudent = new Student();

     // Accessing and displaying attributes and methods
     System.out.println("Name: " + myStudent.firstName);
     System.out.println("Age: " + myStudent.age);
     System.out.println("Graduation Year: " + myStudent.graduationYear);
     myStudent.study(); // Calling the implemented abstract method
 }
}
