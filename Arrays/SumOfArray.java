package Arrays;

public class SumOfArray {
     public static void main(String[] args) {
          // Sum of Array Element
          int[] arr = new int[5];
          arr[0] = 2;
          arr[1] = 12;
          arr[2] = 22;
          arr[3] = -32;
          arr[4] = 42;
          int sum = 0;
          for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
          }
          System.out.println(sum);
     }
}
