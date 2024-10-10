package Arrays;

public class ReverseArray {
     public static void main(String[] args) {
          // Find max Element in An Array
          int[] arr = new int[5];
          arr[0] = 2;
          arr[1] = 12;
          arr[2] = 22;
          arr[3] = -32;
          arr[4] = 42;
          for (int i = arr.length - 1; i >= 0; i--) {
               System.out.println(arr[i]);
          }
     }
}
