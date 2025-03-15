// Define a public class named TypeConversion
public class TypeConversion {
    
    // The main method is the entry point of the Java program
    public static void main(String[] args) {

        // Declaring and initializing variables of different types

        byte b = 109;        // byte: Stores small whole numbers from -128 to 127 (1 byte)
        int a = 39;          // int: Stores whole numbers from -2^31 to (2^31)-1 (4 bytes)
        float f = 8545.544f; // float: Stores decimal numbers with 6-7 decimal digits precision (4 bytes)

        // Explicit Type Casting: Converting float to int (Decimal part is lost)
        int Num = (int) f;  // Type casting float to int (Truncates decimal)

        // Printing values
        System.out.println("byte: " + b);      // Prints the byte value
        System.out.println("int: " + a);       // Prints the int value
        System.out.println("float: " + f);     // Prints the float value
        System.out.println("Num int: " + Num); // Prints the int value after type casting
    }
 
    // Another method to demonstrate type conversion
    public static void main1(String[] args) {

        // Declaring and initializing a double variable
        double d = 5647189.919; // double: Stores decimal numbers with 15 decimal digits precision (8 bytes)

        // Explicit Type Casting: Converting double to long (Decimal part is lost)
        long Num1 = (long) d;  // Type casting double to long (Truncates decimal)
   
        // Printing the converted long value
        System.out.println("Double to long: " + Num1);
    }
}



 


