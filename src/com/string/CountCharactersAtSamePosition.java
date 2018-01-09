package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class CountCharactersAtSamePosition {

  static int countCharacter(String str) {

    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) - 'a' == i || str.charAt(i) - 'A' == i) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(countCharacter("AbgdeF"));
  }

}
