package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by nhtuan on 1/5/2018.
 */
public class RemoveDuplicates {

  static String remove1(String str){

    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    int i = 1;
    int j = 1;
    while (i < arr.length){
     if(arr[i] != arr[i - 1]){
       arr[j] = arr[i];
       j++;
     }
     i++;
    }
    return String.valueOf(arr).substring(0, j);
  }

  static String remove2(String str){



    Set<Character> set = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }
    return String.valueOf(set);
  }

  public static void main(String[] args){
    System.out.println(remove2("eeeefggkkorss"));
  }

}
