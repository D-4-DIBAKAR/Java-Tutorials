package Conditional;

/**
 * This class demonstrates the usage of Java's relational and logical operators
 * as well as basic conditional statements.
 */
public class Conditional {
     /**
      * The main method demonstrates how to use relational and logical operators,
      * which are essential for making comparisons and controlling program flow.
      * 
      * @param args Command-line arguments passed to the program.
      */
     public static void main(String[] args) {
          // Relational Operators:
          /*
           * Relational operators compare two values and return a boolean result.
           * The result is either true or false, based on the comparison.
           * 
           * Common relational operators include:
           * - < : Less than
           * - <= : Less than or equal to
           * - > : Greater than
           * - >= : Greater than or equal to
           * - == : Equal to
           * - != : Not equal to
           */

          int a = 1;
          int b = 2;

          // Example of using '<' (less than) operator
          boolean c = a < b; // true, because 1 is less than 2
          System.out.println(c); // Output: true

          // Example of using '>' (greater than) operator
          c = a > b; // false, because 1 is not greater than 2
          System.out.println(c); // Output: false

          // Example of using '==' (equal to) operator
          c = a == b; // false, because 1 is not equal to 2
          System.out.println(c); // Output: false

          // Example of using '==' to compare strings
          String S1 = "Pool";
          String S2 = "Pool";
          // In this case, S1 == S2 will return true because both refer to the same object
          // in the string pool.
          System.out.println(S1 == S2); // Output: true

          // Logical Operators:
          /*
           * Logical operators are used to combine multiple conditions.
           * - && : Logical AND (returns true if both conditions are true)
           * - || : Logical OR (returns true if at least one condition is true)
           * - ! : Logical NOT (inverts the boolean value)
           */

          // Example of logical operators:
          boolean isAdult = true;
          boolean hasLicense = false;

          // Using logical AND (&&)
          boolean canDrive = isAdult && hasLicense; // false, because hasLicense is false
          System.out.println(canDrive); // Output: false

          // Using logical OR (||)
          boolean canEnterClub = isAdult || hasLicense; // true, because isAdult is true
          System.out.println(canEnterClub); // Output: true

          // Using logical NOT (!)
          boolean notHasLicense = !hasLicense; // true, because hasLicense is false
          System.out.println(notHasLicense); // Output: true

          // Conditional Statements:
          /*
           * Conditional statements allow you to execute specific blocks of code based on
           * certain conditions.
           * 
           * - if statement: Executes a block of code if a specific condition is true.
           * - if-else statement: Executes one block of code if the condition is true, and
           * another block if it's false.
           * - else-if ladder: Allows checking multiple conditions in sequence.
           * - switch statement: Selects one of many code blocks to execute based on the
           * value of a variable.
           */

          // Example: if-else conditional
          int age = 20;
          if (age >= 18) {
               System.out.println("You are an adult."); // This block is executed because age >= 18
          } else {
               System.out.println("You are a minor.");
          }

          // Example: switch statement
          int dayOfWeek = 3; // Let's assume 1 = Monday, 2 = Tuesday, ..., 7 = Sunday
          switch (dayOfWeek) {
               case 1:
                    System.out.println("Monday");
                    break;
               case 2:
                    System.out.println("Tuesday");
                    break;
               case 3:
                    System.out.println("Wednesday");
                    break;
               case 4:
                    System.out.println("Thursday");
                    break;
               case 5:
                    System.out.println("Friday");
                    break;
               case 6:
                    System.out.println("Saturday");
                    break;
               case 7:
                    System.out.println("Sunday");
                    break;
               default:
                    System.out.println("Invalid day");
          }
     }
}
