package DataTypes;

/**
 * This class demonstrates the various data types available in Java.
 * It also prints the minimum and maximum values for each primitive data type.
 */
public class Datatypes {
     /**
      * The main method prints the range of values for Java's primitive data types.
      * These include whole numbers, decimal numbers, booleans, and characters.
      * 
      * @param args Command-line arguments passed to the program.
      */
     public static void main(String[] args) {
          // Whole Number Data Types
          /*
           * byte: 8-bit integer. Range: -128 to 127.
           * short: 16-bit integer. Range: -32,768 to 32,767.
           * int: 32-bit integer. Range: -2^31 to 2^31-1.
           * long: 64-bit integer. Range: -2^63 to 2^63-1.
           */

          // Decimal Number Data Types
          /*
           * float: 32-bit floating-point number. Useful for saving memory in large
           * arrays.
           * double: 64-bit floating-point number. Default choice for decimal values.
           */

          // Boolean Data Type
          /*
           * boolean: Represents true or false values.
           */

          // Character & String Data Types
          /*
           * char: 16-bit Unicode character. Can store any character, such as 'a', '@', or
           * '1'.
           * String: A sequence of characters. Not a primitive type, but commonly used.
           */

          // Displaying the size (range) of various data types
          /*
           * Byte: -128 to 127
           * Short: -32,768 to 32,767
           * Integer: -2,147,483,648 to 2,147,483,647
           * Long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
           */
          System.out.println("Byte : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
          System.out.println("Short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
          System.out.println("Integer : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
          System.out.println("Long : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

          // Decimal Number Ranges
          /*
           * Float: 1.4E-45 to 3.4028235E38
           * Double: 4.9E-324 to 1.7976931348623157E308
           */
          System.out.println("Float : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
          System.out.println("Double : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
     }
}
