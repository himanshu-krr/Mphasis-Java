package Constructor;

public class Student {
	
	String name;
	int age;
	String grade;
	
	public Student()
	{
		name = "unknown";
		age = 0;
		grade = "unknown";
	}
	
	public Student(String sName, int sAge)
	{
		name = sName;
		age = sAge;
	}
	
	public Student(String stuName, int stuAge, String stuGrade)
	{
		name = stuName;
		age = stuAge;
		grade = stuGrade;
	}
	
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	}
	

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.displayDetails();
		
		Student s2 = new Student("Susil",23);
		s2.displayDetails();
		
		Student s3 = new Student("Himanshu",23,"A");
		s3.displayDetails();

	}

}
