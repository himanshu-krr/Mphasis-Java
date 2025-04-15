package UncheckedExceptions;

public class ArithmaticException {

	public static void main(String[] args) {
		int numerator = 10;
        int denominator = 0;

        // This will throw ArithmeticException
        int result = numerator / denominator;

        System.out.println("Result: " + result);
	}

}
