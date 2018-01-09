package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class StringsAreKAnagrams {

  static boolean checkStringsAreKAnagrams(String str1, String str2, int k) {

    int[] count = new int[256];

    for (int i = 0; i < str1.length(); i++) {
      count[str1.charAt(i)]++;
    }

    int result =0;

    for (int i = 0; i < str2.length(); i++) {
      if(count[str2.charAt(i)] != 0){
        count[str2.charAt(i)]--;
      }
      else{
        result++;
      }
    }

    return result <= k ;
  }

  public static void main(String[] args) {
    System.out.println(checkStringsAreKAnagrams("geeks", "eggkf", 1));
  }


}
