package Functions;

public class Function {
     public static int sumOfArray(int[] arr) {
          int res = 0;
          for (int i : arr) {
               res += i;
          }
          return res;
     }

     public static String stringToUppercase(String str) {
          return str.trim().toUpperCase();
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5 };
          System.out.println(sumOfArray(arr));
          String s = "    Hello Friends    ";
          System.out.println(stringToUppercase(s));

     }

     private static int sum(int a, int b) {
          return a + b;
     }

     private static int sum(int a, int b, int c) {
          return a + b + c;
     }
}
