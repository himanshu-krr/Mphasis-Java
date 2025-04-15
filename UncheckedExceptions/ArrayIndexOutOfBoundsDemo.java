package UncheckedExceptions;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing an invalid index
        System.out.println("Accessing index 5:");
        System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
    }
}

