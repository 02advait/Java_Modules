
public class Methods {
// 1. Simple Method that prints a simple message (No parameters, No return value)
    public static void sayHello() {
        System.out.println("Hello, Java!"); // Printing a message
    }

    public static void main1(String[] args) {
        sayHello(); // Calling the method to execute it
    }
//  2. Method with Parameters (Takes Input, No Return)

    // Method that takes a name as input and prints a greeting
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!"); // Printing the greeting message
    }

    public static void main2(String[] args) {
        greetUser("Alice"); // Calling the method with "Alice" as input
    }
//  3. Method with Return Value (Takes Input, Returns Output)

    // Method that adds two numbers and returns the sum
    public static int addNumbers(int a, int b) {
        return a + b; // Returns the sum of the two numbers
    }

    public static void main3(String[] args) {
        int sum = addNumbers(5, 10); // Calling the method and storing the result
        System.out.println("Sum: " + sum); // Printing the returned value
    }
//  4. Method with Multiple Parameters

    // Method that multiplies two numbers and prints the result
    public static void multiply(int a, int b) {
        int result = a * b; // Multiplication operation
        System.out.println("Multiplication: " + result); // Printing the result
    }

    public static void main4(String[] args) {
        multiply(4, 5); // Calling the method with two numbers (4 and 5)
    }
//   5. Method Overloading (Same Name, Different Parameters)

    // Method with one parameter (Displays a number)
    public static void display(int num) {
        System.out.println("Number: " + num);
    }

    // Method with two parameters (Displays a text and a number)
    public static void display(String text, int num) {
        System.out.println("Text: " + text + ", Number: " + num);
    }

    public static void main5(String[] args) {
        display(10); // Calls the first method (integer input)
        display("Hello", 20); // Calls the second method (string + integer input)
    }
}
