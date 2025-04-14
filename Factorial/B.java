package Factorial;

public class B extends A {
	int b;
	public B(int val)
	{
		super(val);
		this.b = val;
	}
	
	public void fact()
	{
		int res = 1;
		for(int i=this.b; i>=1;i--)
		{
			res = res*i;
		}
		System.out.println("From class B result is : "+res);
	}

}
