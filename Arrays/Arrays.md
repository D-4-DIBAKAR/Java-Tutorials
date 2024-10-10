## Java Arrays with Examples

In Java, arrays are used to store multiple values of the same data type in a single variable. An array is a collection of elements, where each element is identified by its index (position). The index of an array starts from 0.<br>
Java supports three types of arrays:

1. One-Dimensional Arrays (1D Array):<br>
   A 1D array is the simplest form of an array where elements are stored in a linear manner and can be accessed using a single index.
   * **Syntax**
     
     ```java
     dataType[] arrayName = new dataType[size];

     ```
   * **Example**
     ```java
     int[] numbers = new int[5]; // An array to hold 5 integers
      numbers[0] = 10; // Assign values
      numbers[1] = 20;
      numbers[2] = 30;
      numbers[3] = 40;
      numbers[4] = 50;

      // Accessing the elements
      for (int i = 0; i < numbers.length; i++) {
          System.out.println(numbers[i]);
      }
      // Output: 10, 20, 30, 40, 50

     ```
3. Two-Dimensional Arrays (2D Array):<br>
  A 2D array is essentially an array of arrays. It can be visualized as a table or grid where each element is accessed using two indices: one for rows and one for columns.
   * **Syntax**
     
     ```java
     dataType[][] arrayName = new dataType[rows][columns];

     ```
   * **Example**
     ```java
      int[][] matrix = new int[2][3]; // 2 rows, 3 columns
      matrix[0][0] = 1;
      matrix[0][1] = 2;
      matrix[0][2] = 3;
      matrix[1][0] = 4;
      matrix[1][1] = 5;
      matrix[1][2] = 6;

      // Accessing the elements
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println(); // Move to the next line after printing each row
      }
      // Output:
      // 1 2 3
      // 4 5 6

     ```
4. Jagged Arrays (Arrays of Arrays with varying lengths):<br>
   A Jagged Array is a special type of 2D array where the inner arrays can have different lengths. This means each row in the array can contain a different number of columns.
   * **Syntax**
     
     ```java
     dataType[][] arrayName = new dataType[rows][];

     ```
   * **Example**
     ```java
      int[][] jaggedArray = new int[3][]; // 3 rows, but columns are defined later
      jaggedArray[0] = new int[2]; // First row has 2 elements
      jaggedArray[1] = new int[3]; // Second row has 3 elements
      jaggedArray[2] = new int[1]; // Third row has 1 element

      jaggedArray[0][0] = 10;
      jaggedArray[0][1] = 20;
      jaggedArray[1][0] = 30;
      jaggedArray[1][1] = 40;
      jaggedArray[1][2] = 50;
      jaggedArray[2][0] = 60;

      // Accessing the elements
      for (int i = 0; i < jaggedArray.length; i++) {
          for (int j = 0; j < jaggedArray[i].length; j++) {
              System.out.print(jaggedArray[i][j] + " ");
          }
          System.out.println(); // Move to the next line after printing each row
      }
      // Output:
      // 10 20
      // 30 40 50
      // 60

     ```

### Summary:
  * 1D Array: A linear collection of elements of the same type. Useful for storing a list of values.
  * 2D Array: An array of arrays, used for representing a matrix or grid.
  * Jagged Array: A 2D array with rows of different lengths, useful when you need to store varying amounts of data in each row.
