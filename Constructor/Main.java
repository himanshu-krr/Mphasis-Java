package Constructor;

public class Main {
	
	String s;
	
	public Main(String s1)
	{
		s = s1;
	}

	public static void main(String[] args) {
		Main m = new Main("Hello");
		System.out.println(m.s);

	}

}
