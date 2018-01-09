package com.string;

/**
 * Created by nhtuan on 1/9/2018.
 */
public class DistinctCharacters {

  static String findDistnctChar(String str){

    int[] count = new int[256];

    String result = "";

    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }

    for (int i = 0; i < 256; i++) {
      if(count[i] == 1){
        result += String.valueOf((char) i);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(findDistnctChar("Hello Geeks"));
  }

}
