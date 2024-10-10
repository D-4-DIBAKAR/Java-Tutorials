## Java Loops with Examples
Loops in Java are used to repeatedly execute a block of code as long as a specified condition is true. They help to avoid code repetition by running the same logic multiple times.
### Types of Loops in Java:
1. for loop<br>
    The for loop is useful when you know exactly how many times you want to repeat a block of code. It consists of three parts:

    - Initialization: This part is executed only once at the start of the loop.
    - Condition: The loop runs as long as the condition evaluates to true.
    - Update: The loop control variable is updated after each iteration (e.g., incremented or decremented).
      
      ```java
      for (int i = 0; i < 5; i++) {
      System.out.println(i);
      }
      // Output: 0, 1, 2, 3, 4
      ```
3. while loop<br>
  The while loop is used when the number of iterations is unknown, and it continues to execute as long as the condition is true. The condition is checked before each iteration.
      ```java
      int i = 0;
      while (i < 5) {
          System.out.println(i);
          i++;
      }
      // Output: 0, 1, 2, 3, 4
      
      ```
5. do-while loop<br>
  The do-while loop guarantees that the code inside the loop is executed at least once because the condition is checked after the loop body has executed.
    ```java
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
    // Output: 0, 1, 2, 3, 4
    ```
7. enhanced for loop (for-each loop)<br>
  The enhanced for loop is designed to iterate through arrays or collections. It simplifies iteration by automatically accessing each element of the collection or array.
    ```java
    int[] numbers = {1, 2, 3, 4, 5};
    for (int num : numbers) {
        System.out.println(num);
    }
    // Output: 1, 2, 3, 4, 5
    ```

### Summary of Loop Characteristics:
- **for loop:** Ideal for a known number of iterations.
- **while loop:** Useful when the number of iterations is not known beforehand.
- **do-while loop:** Guarantees at least one execution of the loop body, regardless of the condition.
- **Enhanced for loop:** Simplifies iteration over arrays or collections, no need to manage index manually.
  
### Additional Control Flow Keywords:
- `break`: Exits the loop immediately, regardless of the condition.
- `continue`: Skips the current iteration and continues with the next one.
  
    ```java
    for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exits the loop when i equals 5
    }
    System.out.println(i);
  }
  // Output: 0, 1, 2, 3, 4

  for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
          continue; // Skips the current iteration if i is even
      }
      System.out.println(i);
  }
  // Output: 1, 3, 5, 7, 9 (odd numbers only)

    ```
