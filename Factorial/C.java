package Factorial;

public class C extends B{
	int c;
	public C(int val)
	{
		super(val);
		this.c = val;
	}
	
	public void fact()
	{
		int res = 1;
		for(int i=this.c; i>=1; i--)
		{
			res *= i;
		}
		System.out.println("From class C result is : "+res);
	}
	
	public static void main(String[] args)
	{
		A a = new A(3);
		B b = new B(4);
		C c = new C(5);
		a.fact();
		b.fact();
		c.fact();
	}

}
