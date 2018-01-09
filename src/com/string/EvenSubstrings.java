package com.string;

/**
 * Created by nhtuan on 1/9/2018.
 */
public class EvenSubstrings {

  static int countEvenSubStrings(String str){
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      int number = str.charAt(i) - '0';
      if((number & 1) == 0){
        result += i + 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(countEvenSubStrings("15"));
  }

}
