package Arrays;

public class FindMaxElement {
     public static void main(String[] args) {
          // Find max Element in An Array
          int[] arr = new int[5];
          arr[0] = 2;
          arr[1] = 12;
          arr[2] = 22;
          arr[3] = -32;
          arr[4] = 42;
          int res = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > res) {
                    res = arr[i];
               }
          }
          System.out.println(res);
     }
}
