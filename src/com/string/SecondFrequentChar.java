package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class SecondFrequentChar {

  public static char findSecondChar(String str){

    int[] count = new int[256];

    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }
    return findsecondChar(count);
  }

  private static char findsecondChar(int[] arr){

    int first = 0, second = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > arr[first]){
        second = first;
        first = i;
      }else if(arr[i] > arr[second] && arr[i] != arr[first]){
        second = i;
      }
    }
    return (char) second;
  }

  public static void main(String[] args){
    System.out.println(findSecondChar("geeksforgeeks"));
  }
}
