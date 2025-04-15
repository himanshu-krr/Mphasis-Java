package CheckedExceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            // Code that might throw an exception
	            int result = 10 / 0; // This will throw an ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            // Handle the exception
	            System.out.println("Cannot divide by zero. Exception: " + e.getMessage());
	        } finally {
	            // Cleanup code
	            System.out.println("Execution of finally block.");
	        }
	}

}
