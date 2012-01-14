package com.anjlab.ssf4j;

import com.anjlab.ssf4j.algorithms.InsertSort;

public abstract class SortHandler<T> implements Sortable<T> {

  private SortAlgorithm<T> defaultAlgorithm = new InsertSort<T>();

  public int from() {
    return 0;
  }

  public abstract int to();

  public abstract T get(int index);

  public abstract void swap(int i, int j);

  public abstract int compare(T a, T b);
  
  public void sort() {
    sort(defaultAlgorithm);
  }

  public void sort(SortAlgorithm<T> algorithm) {
    algorithm.sort(this);
  }

}