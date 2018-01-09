package com.string;

/**
 * Created by nhtuan on 1/5/2018.
 */
public class RemovingSpace {

  static String removingSpace(String str){

    char[] arr = str.toCharArray();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != ' '){
        arr[count++] = arr[i];
      }
    }
    for (int i = count; i < arr.length; i++) {
      arr[i] = '\0';
    }
    return new String(arr);
  }

  public static void main(String[] args){
    System.out.println(removingSpace("g  eeks   for ge  eeks  "));
  }

}
