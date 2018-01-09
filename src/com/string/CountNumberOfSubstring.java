package com.string;

import java.util.Arrays;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class CountNumberOfSubstring {

  public static int countNumberOfSubString(String str, int k){

    int[] count = new int[256];
    int dis = 0;
    int result =0;

    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        if(count[str.charAt(i)] == 0){
          dis++;
        }
        count[str.charAt(i)]++;

        if(dis == k){
          result++;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(countNumberOfSubString("aa", 1));
  }

}
