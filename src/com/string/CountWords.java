package com.string;

/**
 * Created by nhtuan on 1/8/2018.
 */
public class CountWords {

  static int countWords(String str){

    boolean out = true;
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t'){
        out = true;
      }
      else if(out) {
        count++;
        out = false;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println(countWords("One two         three\n    four\tfive  "));
  }

}
