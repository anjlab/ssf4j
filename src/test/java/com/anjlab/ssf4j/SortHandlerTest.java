package com.anjlab.ssf4j;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortHandlerTest {
  
  @Test
  public void testSort() {
    final String[] names = new String[] { "Three", "One", "Two", "Zero" };
    final int[] weights = new int[] { 3, 1, 2, 0 };
    
    SortHandler<Integer> handler = 
        new SortHandler<Integer>() {
          public int from() {
            return 0;
          }
          public int to() {
            return weights.length - 1;
          }
          public Integer get(int index) {
            return weights[index];
          }
          public int compare(Integer a, Integer b) {
            return b - a;
          }
          public void swap(int i, int j) {
            Utils.swap(weights, i, j);
            Utils.swap(names, i, j);
          }
        };
      
    handler.sort();
    
    assertArrayEquals(new String[] { "Zero", "One", "Two", "Three" }, names);
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, weights);
  }
}
