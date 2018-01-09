package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class CharacterOfDecryptedString {


  static char findCharOfDecryptedString(String str, int k) {

    String result = "";

    for (int i = 0; i < str.length(); ) {

      String temp = "";
      int fre = 0;
      while (i < str.length() && str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        temp += String.valueOf(str.charAt(i));
        i++;
      }
      while (i < str.length() && str.charAt(i) >= '1' && str.charAt(i) <= '9') {
        fre = 10 * fre + str.charAt(i) - '0';
        i++;
      }

      for (int j = 0; j < fre; j++) {
        result += temp;
      }

      if(fre == 0){
        result = temp;
      }

    }
    return result.charAt(k-1);
  }

  public static void main(String[] args) {
    System.out.println(findCharOfDecryptedString("ab4c12ed3", 21));
  }

}
