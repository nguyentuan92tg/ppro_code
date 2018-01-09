package com.string;

/**
 * Created by nhtuan on 1/5/2018.
 */
public class StringReverse {

  static String reverse(String str) {

    if (str == null || str.length() == 0) {
      return str;
    }
    return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
  }

  public static void main(String[] args){

   System.out.println(reverse("neyugn naut"));
  }
}
