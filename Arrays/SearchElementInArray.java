package Arrays;

public class SearchElementInArray {
     public static void main(String[] args) {
          // Search Element in an Array
          int arr[] = { 1, 4, 5, 7, -2 };
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == -2)
                    System.out.println("Found at index " + i);
          }
     }
}
