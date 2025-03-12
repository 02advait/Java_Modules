import java.util.Scanner;

public class Assignment1 {
   
    /*  Question 1: Write a Java program to declare and initialize variables of all primitive data types (byte,
short, int, long, float, double, char, boolean) and print their values.*/
    public static void main1(String[] args){
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 100;
        float e = 10.5f;
        double f = 15.32;
        char g = 'T';
        boolean h = a>b;
        System.out.println("Byte:" +a+
        "\nShort" +b+
        "\nInt:" +c+
        "\nLong:" +d+
        "\nFloat:" +e+
        "\nDouble:" +f+
        "\nChar:" +g+
        "\nBoolean:" +h);
    }

    /* Question 2: Write a Java program that takes user input for an int and a double, then performs and
prints the result of their addition, subtraction, multiplication, and division. */
    public static void main2(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        double num2 = sc.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;
        
        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+multi);
        System.out.println("Division: "+div);

    }

    /*Question 3: Write a program to demonstrate the use of the char data type. Assign a character value
and print its ASCII value. */

    public static void main3(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char a = sc.next().charAt(0);

        int value = (int) a;

        System.out.println("Character in string form: "+a);
        System.out.println("Character's ASCII value: "+value);


    }

    /*Question 4: Write a program to convert a given temperature from Fahrenheit to Celsius using the
formula:
C=59×(F−32)C = \frac{5}{9} \times (F - 32)C=95​×(F−32)
and display the result. */

    public static void main4(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: "+c);
    }

    /*Question 5: Write a program that declares a boolean variable isJavaFun and sets it to true. Print a
message based on its value. */

    public static void main5(String[] args){
        boolean isJavaFun = true;
        if (isJavaFun){
            System.out.println("Java is Fun.");
        }else{
            System.out.println("Java is not Fun.");
        }
    }

    /*Question : Write a Java program to declare and print variables of all primitive data types (byte,
short, int, long, float, double, char, boolean). */

public static void main5a(String[] args){
    byte a = 10;
    short b = 20;
    int c = 30;
    long d = 100;
    float e = 10.5f;
    double f = 15.32;
    char g = 'T';
    boolean h = a>b;
    System.out.println("Byte:" +a+
    "\nShort" +b+
    "\nInt:" +c+
    "\nLong:" +d+
    "\nFloat:" +e+
    "\nDouble:" +f+
    "\nChar:" +g+
    "\nBoolean:" +h);

    }

    /*Question : Write a Java program to declare two integer variables, assign them values, and print their
sum. */

    public static void main5b(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();

        System.out.println("Addition of given numbers: "+(num1+num2));

    }

    /*Question : Write a Java program to declare two float variables, assign values, and print their
product. */

    public static void main5c(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter num 2: ");
        float num2 = sc.nextFloat();

        System.out.println("Product of given floats: "+(num1*num2));

    }

    /* Question : Write a Java program to store a character in a variable and print it. */

    public static void main5d(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);

        System.out.println("Given Character: "+a);
    }

    /*Question : Declare a boolean variable named isRaining and assign it true. Print a message:

Take an umbrella!; if it&#39;s true
Enjoy the sunshine!; if it&#39;s false. */

    public static void main5e(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Is it Raining (True/false): ");
        boolean isRaining = sc.nextBoolean();


        if (isRaining){
            System.out.println("Take an umbrella!");
        }else{
            System.out.println("Enjoy the Sunshine!");
        }
    }

    /*Question 8: Write a Java program to demonstrate implicit typecasting (widening conversion) from
int to double and float to double. */

    public static void main8(String[] args){

        int i1 = 123;
        double d1 = i1;

        float f1 = 123.45f;
        double d2 = f1;

        System.out.println("Integer to Double:"+d1);
        System.out.println("Float to Double: "+d2);
    }

    /*Question 9: Write a Java program to demonstrate explicit typecasting (narrowing conversion) from
double to int and long to short. */

    public static void main9(String[] args){

    double d1 = 123.456;
    int i1 = (int) d1;

    long l1 = 123456;
    short s1 = (short) l1;

    System.out.println("Double to Integer:"+i1);
    System.out.println("Long to Short: "+s1);

    }
    /*Question 10: Write a program to take a floating-point number as input and convert it into an integer
using typecasting. */

    public static void main10(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter float number: ");
        float f1 = sc.nextFloat();

        int i1 = (int) f1;
        System.out.println("Float converted to Integer: "+i1);
    }

    /*Question 11: Write a Java program that converts a char to its corresponding int (ASCII) value and
vice versa. */

    public static void main11(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter chacracter: ");
        char c = sc.next().charAt(0);

        int i  = c;

        System.out.println("Enter ASCII value: ");
        int ascii = sc.nextInt();

        char c1 = (char) ascii;

        System.out.println("Character to ASCII: "+i);
        System.out.println("ASCII to Character: "+c1);

    }
    /*Question 12: Write a Java program to convert a String into an integer using Integer.parseInt()
and a floating-point number using Float.parseFloat(). */

public static void main12(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Integer as String: ");
    String s1 = sc.next();

    System.out.println("Enter Float as String: ");
    String s2 = sc.next();

    int i = Integer.parseInt(s1);
    float f = Float.parseFloat(s2);

    System.out.println("String to Integer: " + i);
    System.out.println("String to Float: " + f);

    }

    /*Question 13: Write a program that takes an int as input and converts it into a byte. Display the
original and converted values. */

    public static void main13(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer value: ");
        int i = sc.nextInt();

        byte b = (byte) i;

        System.out.println("Original Integer: "+i);
        System.out.println("Integer to byte: "+b);
    }

    /*Question 14: Write a Java program that takes a double value as input, typecasts it to int, and prints
both values. Explain the precision loss. */

    public static void main14(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Double value: ");
        double d = sc.nextDouble();

        int i = (int) d;

        System.out.println("Original Double: "+d);
        System.out.println("Double to Integer: "+i);

        System.out.println("Precision loss occurs because 'int' does not accept decimal values therefore digits on the right side of the decimal in a 'double' will not be recorded, hence the data loss,");
    }

}
