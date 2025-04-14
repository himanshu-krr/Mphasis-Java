class OuterClass {
    static int sharedCounter = 0; // Static variable

    // Static Nested Class
    static class StaticNestedClass {
        void displayCounter() {
            System.out.println("Shared Counter: " + sharedCounter);
        }
    }

    static void incrementCounter() {
        sharedCounter++; // Modify static variable
    }
}

public class StaticJava {
    public static void main(String[] args) {
        // Accessing static nested class without creating an instance of OuterClass
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();

        nestedObj.displayCounter(); // Output: Shared Counter: 0

        // Modifying static variable through static method
        OuterClass.incrementCounter();
        OuterClass.incrementCounter();

        nestedObj.displayCounter(); // Output: Shared Counter: 2
    }
}
