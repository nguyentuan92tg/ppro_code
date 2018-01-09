package com.array;

/**
 * Created by nhtuan on 1/4/2018.
 */
public class CandlesBlow {

  public String caesarCipher(String s, int k) {

    if(s == null || s.length() == 0){
      return s;
    }

    StringBuilder str = new StringBuilder();
    String lowerStr = s.toLowerCase();

    for (int i = 0; i < lowerStr.length(); i++) {
      if ((lowerStr.charAt(i) >= 'a' && lowerStr.charAt(i) <= 'z')) {
        if (lowerStr.charAt(i) >= 'a' && lowerStr.charAt(i) + k > 'z') {
          str.append((char)(s.charAt(i) + k - 26));
        } else {
          str.append((char)(s.charAt(i) + k));
        }
      } else {
        str.append(s.charAt(i));
      }
    }
    return str.toString();
  }

  public static int camelCase(String s) {

    if(s == null || s.length() == 0){
      return 0;
    }
    int count = 1;
    for (int i = 0; i < s.length() ; i++) {
      if (Character.isUpperCase(s.charAt(i))){
        count++;
      }
    }
    return count;
  }


  public static void main(String[] args) {

   System.out.println(camelCase(""));

  }
}
