package com.array;

/**
 * Created by nhtuan on 11/28/2017.
 */
public class Reverse {

  public static int[] reverse(int[] arr){
    int start = 0, end = arr.length -1;
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

  public static int[] reverse(int[] arr, int start,  int end){

    if(start >=  end) return arr;

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    return reverse(arr, start + 1, end -1);
  }

  public static void main(String[] args){
   int[] arr = {1,3,7,8,9,6,5};
   Utils.printEinArray(reverse(arr, 0, arr.length - 1));
  }
}
