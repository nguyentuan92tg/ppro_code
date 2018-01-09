package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class MaximumConsecutiveRepeatingCharacter {

  static char findMax(String str) {

    int count = 0;
    int cur_count = 0;

    char result = ' ';

    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        cur_count++;
      } else {
        if (cur_count > count) {
          count = cur_count;
          result = str.charAt(i);
        }
        cur_count = 1;
      }
    }
      return result;
  }

  public static void main(String[] args) {
    System.out.println(findMax("geeekk"));
  }


}
