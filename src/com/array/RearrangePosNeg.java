package com.array;

/**
 * Created by nhtuan on 11/29/2017.
 */
public class RearrangePosNeg {


  public static int[] reaarrange(int[] arr) {

    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0 && i != j) {
       swap(arr, i, j);
       j++;
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {

    int[] arr =  { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

    Utils.printEinArray(reaarrange(arr));
  }

}
