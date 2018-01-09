package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class NonRepeatingCharacter {


  static char findNonRepeatingChar(String str, int k){

    int[] count = new int[256];

    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }

    int increament = 0;
    for (int i = 0; i < str.length(); i++) {
      if(count[str.charAt(i)] == 1){
        increament++;
      }
      if(increament == k){
        return str.charAt(i);
      }
    }
    return 'a';
  }

  public static void main(String[] args){
    System.out.println(findNonRepeatingChar("geeksforgeeks", 2));
  }

}
