package com.string;

/**
 * Created by nhtuan on 1/5/2018.
 */
public class CheckingPangram {

  static boolean checkingPangram(String str) {

    boolean[] marks = new boolean[26];

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        marks[str.charAt(i) - 'a'] = true;
      } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        marks[str.charAt(i) - 'A'] = true;
      }
    }
    return checkingPangram(marks);
  }

  private static boolean checkingPangram(boolean[] marks) {

    for (int i = 0; i < marks.length; i++) {
      if (!marks[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    System.out.println(checkingPangram("The quick brown fox jumps over the lazy dog"));
  }
}
