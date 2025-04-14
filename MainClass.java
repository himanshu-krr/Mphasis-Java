public class MainClass {
    public static void main(String[] args) {
        // Create an object of MyMethods class
        MyMethods myMethods = new MyMethods();
         
        // Call the method
        int sum = myMethods.addNumbers(5, 3);
        System.out.println("The sum is: " + sum);
        
        int sub = myMethods.subNumbers(5, 3);
        System.out.println("The difference is: " + sub); 
    }
}
