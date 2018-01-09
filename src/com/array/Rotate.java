package com.array;

/**
 * Created by nhtuan on 11/24/2017.
 */
public class Rotate {

  public static int[] rotateOneByOne(int[] arr, int lift, int length) {

    for (int i = 0; i < optimizeLift(lift, length); i++) {
      rotateByOne(arr, arr.length);
    }
    return arr;
  }

  private static int optimizeLift(int lift, int length) {
    return lift % length;
  }

  private static int[] rotateByOne(int[] arr, int length) {
    int temp = arr[0];
    for (int i = 0; i < length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[length - 1] = temp;
    return arr;
  }

  public static void rotateJuggle(int[] arr) {

  }

  public static int[] rotateReveratal(int[] arr, int lift) {
    reverseArr(arr, 0, lift - 1);
    reverseArr(arr, lift, arr.length - 1);
    reverseArr(arr, 0, arr.length - 1);
    return arr;
  }

  private static int[] reverseArr(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

  public static int[] leftRotate(int arr[], int d, int n) {
    int i, j;
    if (d == 0 || d == n) {
      return arr;
    }
    i = d;
    j = n - d;
    while (i != j) {
      if (i < j) /*A is shorter*/ {
        swap(arr, d - i, d + j - i, i);
        j -= i;
      } else /*B is shorter*/ {
        swap(arr, d - i, d, j);
        i -= j;
      }
      // printArray(arr, 7);
    }
  /*Finally, block swap A and B*/
    swap(arr, d - i, d, i);

    return arr;
  }

  static void swap(int arr[], int fi, int si, int d) {
    int i, temp;
    for (i = 0; i < d; i++) {
      temp = arr[fi + i];
      arr[fi + i] = arr[si + i];
      arr[si + i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 5, 6, 7, 4};
    //Utils.printEinArray(rotateOneByOne(arr, 0, arr.length));
    Utils.printEinArray(leftRotate(arr, 3, arr.length));
  }
}
