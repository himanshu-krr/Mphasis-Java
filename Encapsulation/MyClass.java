package Encapsulation;

public class MyClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Himanshu");
//		p.setVar(3, 4);
		System.out.println(p.getName());
//		System.out.println(p.getA() + p.getB());
		
		Person p1 = new Person();
		p1.setVar(2, 4);
		System.out.println(p1.getA()+p1.getB());
		
		Person p2 = new Person();
		p2.setGrade('A');
		System.out.println(p2.getGrade());

	}

}
