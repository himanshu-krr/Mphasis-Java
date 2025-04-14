package testpackage;

import mypackage.*;

public class TestClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage();

        AnotherClass anotherClass = new AnotherClass();
        anotherClass.anotherMessage();
    }
}
