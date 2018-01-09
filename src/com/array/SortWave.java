package com.array;

import java.util.Arrays;

/**
 * Created by nhtuan on 11/29/2017.
 */
public class SortWave {

  public static int[] sortInWave(int[] arr) {
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i = i + 2) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    return arr;
  }

  public static int[] sortInWave1(int[] arr){

    for (int i = 0; i < arr.length; i += 2) {
      if(i < arr.length -1 && arr[i] < arr[i+1]){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
      if(i > 0 && arr[i] > arr[i -1]){
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] =  temp;
      }
    }

    return arr;
  }




  public static void main(String[] args) {
    int[] arr = {10, 90, 49, 2, 1, 5, 23};

    Utils.printEinArray(sortInWave1(arr));

  }
}
