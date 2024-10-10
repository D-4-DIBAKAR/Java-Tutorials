# Java Functions (Methods)
In Java, a function (also called a method) is a block of code that performs a specific task and can be reused. Functions enhance code reusability and modularity, making the code more maintainable. Java functions can accept inputs (parameters), perform a task, and return an output. Java methods are always associated with a class.
### Types of Functions in Java
1. Predefined Functions: These are built-in methods that Java provides, such as `System.out.println(`, `Math.pow()`, etc.
2. User-defined Functions: These are methods created by the programmer to perform specific tasks.
### Syntax of a Java Function
```java
returnType functionName(parameters) {
    // Function body (code to execute)
    return returnValue;
}

```
### Components:
* returnType: The data type of the value returned by the function. If no value is returned, the return type is void.
* functionName: The name of the function.
* parameters: Values passed to the function (optional).
* function body: The code that defines the function’s behavior.
* returnValue: The value that is returned from the function (if any).

### Example of a Simple Function
```java
public class FunctionExample {
     // A simple function to add two numbers
     public static int sum(int a, int b) {
          return a + b;
     }

     public static void main(String[] args) {
          int result = sum(10, 20);
          System.out.println("Sum: " + result);
     }
}

```
#### Explanation:
* public static int sum(int a, int b) is a function that takes two integers (a and b) as input and returns their sum as an integer.
* int result = sum(10, 20) calls the function sum with arguments 10 and 20, and stores the result (30) in the variable result.
### Function Overloading
Java supports method overloading, where multiple methods can have the same name but different parameter lists. This allows for the creation of multiple methods with the same name but different input parameters, allowing different behaviors based on input.

```java
public class FunctionOverloading {
     // Overloaded function with 2 parameters
     public static int sum(int a, int b) {
          return a + b;
     }

     // Overloaded function with 3 parameters
     public static int sum(int a, int b, int c) {
          return a + b + c;
     }

     public static void main(String[] args) {
          System.out.println(sum(10, 20));  // Calls sum with 2 parameters
          System.out.println(sum(10, 20, 30));  // Calls sum with 3 parameters
     }
}

```
#### Explanation:
* The method sum(int a, int b) adds two integers.
* The method sum(int a, int b, int c) adds three integers.
* Java automatically selects the appropriate version of the sum() method based on the number of arguments passed.
### Returning Values from a Function
A function can return a value using the `return` statement. The return type of the method must match the data type of the returned value.
```java
public class ReturnExample {
     public static String greet(String name) {
          return "Hello, " + name + "!";
     }

     public static void main(String[] args) {
          String message = greet("Alice");
          System.out.println(message);  // Output: Hello, Alice!
     }
}

```
### Passing Arrays to Functions
Java allows passing entire arrays as arguments to functions. Inside the function, we can iterate through the array or manipulate its values.
```java
public class ArrayFunction {
     // Function to calculate the sum of all elements in an array
     public static int sumOfArray(int[] arr) {
          int res = 0;
          for (int i : arr) {
               res += i;
          }
          return res;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5 };
          System.out.println("Sum of Array: " + sumOfArray(arr));  // Output: 15
     }
}

```
#### Explanation:
* The function sumOfArray(int[] arr) accepts an array as a parameter.
* Inside the function, it calculates the sum of all elements of the array using a for-each loop and returns the sum.
### Working with Strings in Functions
Java's String class is used to create and manipulate strings. Functions can perform operations on strings such as converting to uppercase, trimming whitespace, and more.
```java
public class StringFunction {
     // Function to convert a string to uppercase and trim whitespace
     public static String stringToUppercase(String str) {
          return str.trim().toUpperCase();
     }

     public static void main(String[] args) {
          String s = "    Hello Friends    ";
          System.out.println(stringToUppercase(s));  // Output: HELLO FRIENDS
     }
}

```
#### Explanation:
* The method `stringToUppercase(String str)` removes leading and trailing whitespace from the string using `trim()` and converts it to uppercase using `toUpperCase()`.
### Void Functions (Functions Without Return Value)
Sometimes functions perform an action without returning any value. Such functions have a return type of void.
```java
public class VoidFunction {
     // Function to display a message
     public static void displayMessage(String message) {
          System.out.println(message);
     }

     public static void main(String[] args) {
          displayMessage("Hello, World!");  // Output: Hello, World!
     }
}

```
#### Explanation:
* The function displayMessage(String message) prints the given message to the console. It doesn’t return any value, so its return type is void.
### Scope of Variables in Functions
Variables declared inside a function are local to that function. They cannot be accessed outside of the function.
```java
public class ScopeExample {
     public static void printSum() {
          int a = 5;  // Local variable
          int b = 10;  // Local variable
          System.out.println("Sum: " + (a + b));
     }

     public static void main(String[] args) {
          printSum();  // Output: Sum: 15
          // System.out.println(a);  // This would cause an error as 'a' is not accessible here.
     }
}

```
### Main Function in Java
The main() method is the entry point of any Java program. It is always public, static, and void, and it takes a single parameter: an array of String objects (String[] args).
```java
public static void main(String[] args) {
    // Code to execute
}

```
#### Explanation:
* public: The method is accessible from anywhere.
* static: The method can be called without creating an instance of the class.
* void: The method does not return any value.
* String[] args: This parameter stores command-line arguments.

<hr>
In Java, functions (methods) are an essential part of programming that helps break down code into smaller, reusable pieces. Key concepts to remember:

* Function Overloading allows multiple methods with the same name but different parameters.
* Return Types specify the type of value a method returns.
* Void Methods perform actions without returning a value.
* Arrays and strings can be passed to methods for further manipulation.
* Variables inside functions are local to those functions, ensuring the encapsulation of data.
* By writing and using functions effectively, we can build cleaner, more modular Java programs.
