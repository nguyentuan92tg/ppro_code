package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class SameFirstAndLastCharacters {

  static int countChar(String str){

    int count = 0;

    int n = str.length();
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if(str.charAt(i) == str.charAt(j)){
          count++;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countChar("abcab"));
  }

}
