package com.string;

/**
 * Created by nhtuan on 1/5/2018.
 */
public class StringReverseWithoutSpecialChar {

  static String reverse(String str) {

    char[] arr = str.toCharArray();
    int n = arr.length;
    int i = 0, j = n - 1;

    while (i < n / 2) {
      if (!isAlphabet(arr[i])) {
        i++;
      } else if (!isAlphabet(arr[j])) {
        j--;
      } else {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    return String.valueOf(arr);
  }

  private static boolean isAlphabet(char ch) {
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
  }


  public static void main(String[] args) {

    System.out.println(reverse("Ab,c,de!$"));
  }

}
