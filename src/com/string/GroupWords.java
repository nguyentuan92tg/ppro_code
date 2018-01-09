package com.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by nhtuan on 1/9/2018.
 */
public class GroupWords {

  static void arrange(String[] arr){

    Map<String, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {

      String key = generateKey(arr[i]);

      if(map.get(key) != null){
        List<Integer> lst = map.get(key);
        lst.add(i);
        map.put(key,lst);
      }else{
        List<Integer> newList = new ArrayList<>();
        newList.add(i);
        map.put(key, newList);
      }
    }

    Set<Entry<String, List<Integer>>> entries = map.entrySet();
    for (Entry<String, List<Integer>> it : entries){
      List<Integer> value = it.getValue();
      for (Integer v : value) {
        System.out.print(arr[v] +" ");
      }
      System.out.println();
    }
  }

  private static String generateKey(String str){

    boolean[] count = new boolean[256];

    for (int i = 0; i < str.length(); i++) {
      if(!count[str.charAt(i)]){
        count[str.charAt(i)] = true;
      }
    }
    String key = "";
    for (int i = 0; i < count.length; i++) {
      if(count[i]){
        key = key.concat(String.valueOf((char) i));
      }
    }
    return key;
  }

  public static void main(String[] args) {

    String words[] = { "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act", "tab",
        "bat", "flow", "wolf", "lambs", "amy", "yam",
        "balms", "looped", "poodle"};
    arrange(words);
  }


}
