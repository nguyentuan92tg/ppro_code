package com.array;

public class SearchingElement {

  public static int search(int[] arr, int key) {

    int pivot = findPivot(arr, 0, arr.length - 1);
    if(arr[pivot] > key)
      return searchBinary(arr, 0, pivot, key);
    return searchBinary(arr, pivot + 1, arr.length -1, key);

  }

  public static int searchBinary(int[] arr, int low, int high, int key){
    if(low > high) return -1;

    int mid = (low + high)/2;
    if(arr[mid] == key) return mid;

    if(arr[mid] > key) return searchBinary(arr, low, mid, key);
    return searchBinary(arr,mid +1,  high, key);
  }

  private static int findPivot(int[] arr, int low, int high) {

    if (low > high) return -1;
    if (low == high) return low;

    int mid = (low + high) / 2;
    if (mid < high && arr[mid] > arr[mid + 1]) return mid;
    if(mid > low && arr[mid] < arr[mid - 1]) return mid -1;
    if(arr[low] >= arr[mid]) return findPivot(arr, low, mid -1);
    return findPivot(arr, mid + 1, high);
  }

  public static void main(String[] args){
   int[] arr = {7,8,9,1,2,3,4,6};
   //System.out.print(findPivot(arr, 0, arr.length-1));

    //int[] arr1 = {1,2,3,4,5,6};
    //System.out.print(searchBinary(arr1, 0, arr.length -1, 6));
    System.out.println(search(arr, 7));

  }
}
