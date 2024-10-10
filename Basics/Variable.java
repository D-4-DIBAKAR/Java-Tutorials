package Basics;

/**
 * This class demonstrates the usage of variables in Java and
 * explains the rules for naming variables.
 */
public class Variable {
     /**
      * The main method demonstrates the following:
      * - Declaration and initialization of variables.
      * - Java's rules for naming variables.
      * - Output of variable values.
      */
     public static void main(String[] args) {
          // Variables in Java are case sensitive
          // Variable names can consist of letters, digits, dollar signs ($), and
          // underscores (_)
          // They must begin with a letter, a dollar sign ($), or an underscore (_)
          // Java keywords cannot be used as variable names

          // Valid variable name starting with a dollar sign
          int $age = 23; // Example 1: Valid variable name
          System.out.println($age); // Outputs: 23

          // Valid variable name starting with an underscore
          int _age = 24; // Example 2: Valid variable name
          System.out.println(_age); // Outputs: 24

          // Invalid variable name - cannot start with a digit
          // int 1age = 23; // Example of invalid variable name (uncommenting will cause
          // an error)
          // System.out.println(1age); // This will cause a syntax error

          // Declaring and initializing variables
          int a = 10; // 'a' is an integer variable
          double b = 2.5; // 'b' is a double (floating-point) variable

          // Outputting variable values
          System.out.println(a + " " + b); // Outputs: 10 2.5
     }
}
