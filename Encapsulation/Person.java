package Encapsulation;

public class Person {
	private String name;
	private int a,b;
	private char grade;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public void setVar(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	
	public char getGrade()
	{
		return grade;
	}
	
}
