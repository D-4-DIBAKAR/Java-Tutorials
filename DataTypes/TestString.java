package DataTypes;

public class TestString {
     public static void main(String[] args) {
          // int a = 1;
          // char c = 'a';
          // boolean isPassed = true;
          // String name = "Dev";// Sequence of Characters
          // String address = new String("India");
          // System.out.println(name);
          // String a = new String("Ram");
          // String b = new String("Ram");
          // System.out.println(a == b + "\n" + a + "\n" + b);
          // System.out.println(a == b);// false -> Reference Check
          // String c = "Ram";
          // String d = "Ram";
          // System.out.println(c == d);// true

          // String Methods
          // String name = "Ram";
          // int length = name.length();// For String Length
          // System.out.println(length);
          // char c = name.charAt(1);// Character At given index[0-length-1]
          // System.out.println(c);
          // String name2 = "Ram";
          // System.out.println(name.equals(name2));// Check is equal or not
          // System.out.println(name.equalsIgnoreCase(name2));// Check is equal or not
          // also case insensitive
          // String name3 = "Hari";
          // System.out.println('R' + 0);
          // System.out.println('H' + 0);
          // System.out.println(name.compareTo(name3));// Return difference with ASCII
          // value, Here R-82,H-72 ,R-H=10
          // System.out.println(name.compareToIgnoreCase(name3));// Return difference with
          // ASCII value, Here R-82,H-72
          // ,R-H=10
          String str = "    Hello World ";
          // System.out.println(str.substring(6));// World
          // Prints the parts of the String
          // System.out.println(str.substring(6, 9));// Wor
          // Prints the parts of the String ,end index not included
          System.out.println(str.toUpperCase());// Converts to UpperCase //HELLO WORLD
          System.out.println(str.toLowerCase());// Converts to LowerCase //hello world
          System.out.println(str.trim()); // Remove Space from start & End of String
          String name = "Avinash Roy";
          System.out.println(name.replace("Roy", "Sharma"));
          // Replace Part of the String which Matches the target string
          System.out.println(name.contains("Roy"));// Check requested String Present or not
          System.out.println(name.startsWith("Av"));// Checks preceded(prefix) with or not
          System.out.println(name.endsWith("oy"));// Checks ends(suffix) with or not

     }
}
