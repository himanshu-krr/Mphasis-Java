package Factorial;

public class A {
	int a;
	public A(int val)
	{
		this.a = val;
	}
	
	public void fact()
	{
		int res = 1;
		for(int i=this.a; i>=1;i--)
		{
			res = res*i;
		}
		System.out.println("From class A result is : "+res);
	}

}
