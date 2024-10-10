package DataTypes;

/**
 * This class demonstrates the usage of various methods available for Java's
 * `String` class.
 * String handling and manipulation is a fundamental part of Java programming.
 */
public class StringMethods {
     /**
      * The main method showcases different methods for manipulating and working with
      * strings in Java.
      * These methods include comparison, transformation, trimming, and more.
      * 
      * @param args Command-line arguments passed to the program.
      */
     public static void main(String[] args) {
          // Creating a string with leading and trailing spaces
          String str = "    Hello World ";

          // String Methods Demonstration:

          // 1. `toUpperCase()`:
          // Converts all characters of the string to uppercase.
          System.out.println(str.toUpperCase()); // Output: HELLO WORLD

          // 2. `toLowerCase()`:
          // Converts all characters of the string to lowercase.
          System.out.println(str.toLowerCase()); // Output: hello world

          // 3. `trim()`:
          // Removes any leading and trailing whitespace from the string.
          System.out.println(str.trim()); // Output: Hello World

          // 4. `replace()`:
          // Replaces occurrences of a target string with a specified string.
          String name = "Avinash Roy";
          System.out.println(name.replace("Roy", "Sharma")); // Output: Avinash Sharma

          // 5. `contains()`:
          // Checks if the string contains the specified sequence of characters.
          System.out.println(name.contains("Roy")); // Output: true

          // 6. `startsWith()`:
          // Checks if the string starts with the specified prefix.
          System.out.println(name.startsWith("Av")); // Output: true

          // 7. `endsWith()`:
          // Checks if the string ends with the specified suffix.
          System.out.println(name.endsWith("oy")); // Output: true

          // 8. `isEmpty()`:
          // Checks if the string is empty (i.e., its length is 0).
          System.out.println(name.isEmpty()); // Output: false

          // 9. `isBlank()`:
          // Checks if the string is blank (i.e., either empty or containing only
          // whitespace).
          System.out.println(name.isBlank()); // Output: false

          // 10. `indexOf()`:
          // Returns the index of the first occurrence of the specified character in the
          // string.
          System.out.println(name.indexOf('s')); // Output: 5

          // 11. `lastIndexOf()`:
          // Returns the index of the last occurrence of the specified character in the
          // string.
          System.out.println(name.lastIndexOf('h')); // Output: 7

          // 12. `valueOf()`:
          // Converts a given value (int, float, etc.) to its string representation.
          int a = 10;
          String strVal = String.valueOf(a);
          System.out.println(strVal); // Output: "10"

          // 13. `String.format()`:
          // Creates a formatted string by inserting values into placeholders.
          String formattedStr = String.format("My name is %s and I am %d years old.", "Dev", 22);
          System.out.println(formattedStr); // Output: My name is Dev and I am 22 years old.

          // 14. `substring()`:
          // Extracts a portion of the string, starting from the given index to the end.
          // You can also specify the start and end index (end index is exclusive).
          String strr = "Vipul Tyagi";
          System.out.println(strr.substring(2, 8)); // Output: pul Ty
          System.out.println(strr.subSequence(2, 8)); // Output: pul Ty (same as `substring`, but returns
                                                      // `CharSequence`)

          // Additional Notes:
          // The `==` operator compares references, not content. Hence, use `.equals()` to
          // compare string values.
          // The `compareTo()` method can be used to compare strings lexicographically
          // (based on Unicode values).
     }
}
