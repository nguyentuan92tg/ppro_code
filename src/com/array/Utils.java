package com.array;

import java.util.Arrays;

/**
 * Created by nhtuan on 11/24/2017.
 */
public class Utils {

  public static void printEinArray(int[] arr){
    Arrays.stream(arr).forEach(System.out::println);
  }
}
