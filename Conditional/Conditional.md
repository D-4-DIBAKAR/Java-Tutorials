## 1. Relational Operators:

* `<`(less than): Returns `true` if the value on the left is less than the value on the right.
  - Example: `a < b` returns `true` if `a` is less than `b`.
* `<=`(less than or equal to): Returns `true` if the value on the left is less than or equal to the value on the right.
* `>`(greater than): Returns `true` if the value on the left is greater than the value on the right.
* `>=`(greater than or equal to): Returns `true` if the value on the left is greater than or equal to the value on the right.
* `==`(equal to): Returns `true` if the two values are equal.
  - For strings,  `==` compares references (memory locations), not values. For value comparison, use `.equals()`.
* `!=`(not equal to): Returns `true` if the two values are not equal.

## 2. Logical Operators:

* `&&` (logical AND): Returns `true` only if both operands are true. If either operand is false, the result is false.
  - Example: true && false returns false.
* `||` (logical OR): Returns `true` if at least one of the operands is true. If both are false, the result is false.
  - Example: true || false returns true.
* `!` (logical NOT): Reverses the value of a boolean expression. If it's `true`, it becomes false, and vice versa.
  
## 3. Conditional Statements:
* `if`: Executes a block of code if a specified condition is `true`.<br>
  **Example:**
  ```java
    if (age >= 18) {
    System.out.println("Adult");
  }
  ```

* `if-else`: Executes one block of code if the condition is `true`, and another if it’s `false`.<br>
 **Example:**
  ```java
    if (age >= 18) {
    System.out.println("Adult");
  } else {
      System.out.println("Minor");
  }
  ```
* `switch`: Selects one of many blocks of code to execute based on the value of a variable.<br>
 **Example:**
  ```java
   switch (dayOfWeek) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
  }
  ```
