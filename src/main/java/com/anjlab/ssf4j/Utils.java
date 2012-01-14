package com.anjlab.ssf4j;

public class Utils {

  public static void swap(byte[] array, int i, int j) {
    byte temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(short[] array, int i, int j) {
    short temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(long[] array, int i, int j) {
    long temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(double[] array, int i, int j) {
    double temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(float[] array, int i, int j) {
    float temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void swap(char[] array, int i, int j) {
    char temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static <T> void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
