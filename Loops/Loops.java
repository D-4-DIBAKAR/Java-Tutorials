package Loops;

/**
 * This class demonstrates the different types of loops in Java.
 */
public class Loops {
     /**
      * The main method shows examples of using various loops in Java.
      * Loops allow for repeated execution of code until a certain condition is met.
      * 
      * @param args Command-line arguments passed to the program.
      */
     public static void main(String[] args) {
          // Example 1: for loop
          /**
           * The `for` loop is typically used when you know how many times you want to
           * iterate the loop.
           * 
           * Syntax:
           * for (initialization; condition; increment/decrement) {
           * // Code to be executed
           * }
           * 
           * - `initialization`: Initializes a loop control variable.
           * - `condition`: The loop continues as long as this condition is true.
           * - `increment/decrement`: Increases or decreases the loop control variable.
           */

          System.out.println("For Loop Example:");
          for (int i = 0; i < 5; i++) {
               System.out.println("Iteration: " + i);
          }
          // Output: 0, 1, 2, 3, 4 (5 iterations)

          // Example 2: while loop
          /**
           * The `while` loop is used when you don't know the exact number of iterations
           * in advance.
           * It will continue to execute the loop body as long as the condition is true.
           * 
           * Syntax:
           * while (condition) {
           * // Code to be executed
           * }
           */
          System.out.println("\nWhile Loop Example:");
          int j = 0;
          while (j < 5) {
               System.out.println("Iteration: " + j);
               j++;
          }
          // Output: 0, 1, 2, 3, 4 (5 iterations)

          // Example 3: do-while loop
          /**
           * The `do-while` loop is similar to the `while` loop, but it guarantees that
           * the loop body will execute at least once, even if the condition is false.
           * 
           * Syntax:
           * do {
           * // Code to be executed
           * } while (condition);
           */
          System.out.println("\nDo-While Loop Example:");
          int k = 0;
          do {
               System.out.println("Iteration: " + k);
               k++;
          } while (k < 5);
          // Output: 0, 1, 2, 3, 4 (5 iterations)

          // Example 4: Enhanced for loop (for-each loop)
          /**
           * The enhanced for loop (also known as the `for-each` loop) is used to iterate
           * over arrays or collections like ArrayList, Set, etc.
           * It simplifies the code when you don't need to track the index.
           * 
           * Syntax:
           * for (type variable : collection) {
           * // Code to be executed
           * }
           */
          System.out.println("\nEnhanced For Loop Example:");
          int[] numbers = { 1, 2, 3, 4, 5 };
          for (int num : numbers) {
               System.out.println("Number: " + num);
          }
          // Output: 1, 2, 3, 4, 5 (Iterates over the array)
     }
}
