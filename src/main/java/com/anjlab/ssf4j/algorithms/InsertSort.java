package com.anjlab.ssf4j.algorithms;

import com.anjlab.ssf4j.SortAlgorithm;
import com.anjlab.ssf4j.Sortable;

public class InsertSort<T> implements SortAlgorithm<T> {

  public void sort(Sortable<T> s) {
    int from = s.from();
    int to = s.to();
    for (int i = from + 1; i <= to; i++) {
      int j = i;
      while (j > from && s.compare(s.get(j), s.get(j - 1)) > 0) {
        s.swap(j, j - 1);
        j--;
      }
    }
  }

}
