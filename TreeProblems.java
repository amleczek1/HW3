/*
 * *** Adrian Mleczek/001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

   TreeSet<Integer> common = new TreeSet<>(setA);
        TreeSet<Integer> result = new TreeSet<>(setA); 
        common.retainAll(setB);
        result.addAll(setB);
        result.removeAll(common);
        return result; 

    
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    Iterator<Integer> iterator = treeMap.keySet().iterator();
    while (iterator.hasNext())
      {
      Integer ChKey = iterator.next();
      if (ChKey % 2 ==0) 
      {
        iterator.remove();
      }
      }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        for (Map.Entry<Integer, String> entry : tree1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (!tree2.containsKey(key)) {
                return false;
            }
            if (!value.equals(tree2.get(key))) {
                return false;
            }
        }
        return true;
    //or return tree1.equals(tree2) lol

  }

} // end treeProblems class
