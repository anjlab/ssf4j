package com.anjlab.ssf4j;

import java.util.Comparator;

public interface Sortable<T> extends Comparator<T> {

  public abstract int from();

  public abstract int to();

  public abstract T get(int index);

  public abstract void swap(int i, int j);

}