import java.util.*;

 class Solution {

  public static void main(String[] args) {
    
    int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
    System.out.print("Initial Array : ");
    printArray(arr);
    bubbleSort(arr);
  }
  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
  }
  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }

      System.out.print("After pass " + i + "  : ");
      //Printing array after pass
      printArray(arr);
    }
  }
}