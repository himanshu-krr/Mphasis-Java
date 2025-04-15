package UncheckedExceptions;

class NPEDemo {
	public void checkStrings(String str1, String str2) {
		try {
			if(str1.contains(str2)){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		} catch (Exception e) {
			System.out.println("Error came da ...");
		}
	}
}

public class NullPointerExceptionDemo {
	public static void main(String args[]) {
		NPEDemo obj = new NPEDemo();
		obj.checkStrings("s",null);
	}
}