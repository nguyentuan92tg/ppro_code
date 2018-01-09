package com.array;

// A JAVA program to put positive numbers at even indexes
// (0, 2, 4,..) and negative numbers at odd indexes (1, 3,
// 5, ..)
public class Alternate {

  // The main function that rearranges elements of given
  // array.  It puts positive elements at even indexes (0,
  // 2, ..) and negative numbers at odd indexes (1, 3, ..).
  static void rearrange(int arr[], int n) {

    int j = 0, temp;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < 0){
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        j++;
      }
    }
    printArray(arr, arr.length);

    int pos = j + 1;
    int neg =0;
    while (pos < n && arr[neg] < 0){
     temp = arr[neg];
    }
  }

  // A utility function to print an array
  static void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + "   ");
    }
  }

  /*Driver function to check for above functions*/
  public static void main(String[] args) {
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    int n = arr.length;
    rearrange(arr, n);
    //System.out.println("Array after rearranging: ");
   // printArray(arr, n);
  }

}
