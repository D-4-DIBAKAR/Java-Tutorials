package Arrays;

/**
 * This class demonstrates the use of 1D, 2D, and Jagged Arrays in Java.
 */
public class Arrays {
     /**
      * The main method shows examples of using different types of arrays in Java.
      * Arrays are used to store multiple values in a single variable.
      * 
      * @param args Command-line arguments passed to the program.
      */
     public static void main(String[] args) {
          // 1. One-Dimensional Array (1D Array)
          /**
           * A one-dimensional array is a list of elements, and each element is accessed
           * using a single index.
           * 
           * Syntax: dataType[] arrayName = new dataType[size];
           */
          System.out.println("1D Array Example:");
          int[] arr1D = new int[5]; // Declaring and initializing a 1D array of size 5
          arr1D[0] = 10; // Assigning values to array
          arr1D[1] = 20;
          arr1D[2] = 30;
          arr1D[3] = 40;
          arr1D[4] = 50;

          // Printing the 1D array elements
          for (int i = 0; i < arr1D.length; i++) {
               System.out.println("Element at index " + i + ": " + arr1D[i]);
          }

          // 2. Two-Dimensional Array (2D Array)
          /**
           * A two-dimensional array is an array of arrays, where each element is accessed
           * using two indices.
           * 
           * Syntax: dataType[][] arrayName = new dataType[rows][columns];
           */
          System.out.println("\n2D Array Example:");
          int[][] arr2D = new int[2][3]; // Declaring and initializing a 2D array (2 rows, 3 columns)
          arr2D[0][0] = 1;
          arr2D[0][1] = 2;
          arr2D[0][2] = 3;
          arr2D[1][0] = 4;
          arr2D[1][1] = 5;
          arr2D[1][2] = 6;

          // Printing the 2D array elements
          for (int i = 0; i < arr2D.length; i++) {
               for (int j = 0; j < arr2D[i].length; j++) {
                    System.out.print(arr2D[i][j] + " ");
               }
               System.out.println(); // New line after each row
          }

          // 3. Jagged Array (Array of Arrays with Varying Length)
          /**
           * A jagged array is an array of arrays where the inner arrays can have
           * different lengths.
           * 
           * Syntax: dataType[][] arrayName = new dataType[rows][];
           */
          System.out.println("\nJagged Array Example:");
          int[][] jaggedArray = new int[3][]; // Declaring a jagged array with 3 rows
          jaggedArray[0] = new int[2]; // First row has 2 columns
          jaggedArray[1] = new int[3]; // Second row has 3 columns
          jaggedArray[2] = new int[1]; // Third row has 1 column

          // Assigning values to jagged array
          jaggedArray[0][0] = 10;
          jaggedArray[0][1] = 20;
          jaggedArray[1][0] = 30;
          jaggedArray[1][1] = 40;
          jaggedArray[1][2] = 50;
          jaggedArray[2][0] = 60;

          // Printing the jagged array elements
          for (int i = 0; i < jaggedArray.length; i++) {
               for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j] + " ");
               }
               System.out.println(); // New line after each row
          }
     }
}
