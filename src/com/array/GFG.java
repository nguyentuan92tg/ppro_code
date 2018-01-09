package com.array;

import java.util.Optional;

/**
 * Created by nhtuan on 11/30/2017.
 */
public class GFG {

  public static int[] rearrange(int[] arr) {

    int[] temp = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if ((i & 1) == 0) {
        temp[i] = arr[(arr.length - 1 - (i / 2))];
      } else {
        temp[i] = arr[(i - 1 )/ 2];
      }
    }
    arr = temp.clone();
  return arr;
  }

  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    Utils.printEinArray(rearrange(arr));
  }
}
