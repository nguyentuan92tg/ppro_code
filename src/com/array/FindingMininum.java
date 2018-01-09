package com.array;

/**
 * Created by nhtuan on 11/27/2017.
 */
public class FindingMininum {

  public static int findMininum(int[] arr, int low, int high){

    if(low > high) return -1;

    if(low == high) return arr[low];

    int mid = (low + high)/2;

    if(mid > low && arr[mid] < arr[mid+1])
      return arr[mid];

   /* if(mid < high && arr[mid] > )*/
   return 0;

  }

}
