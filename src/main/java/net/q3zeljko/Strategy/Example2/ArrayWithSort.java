package net.q3zeljko.Strategy.Example2;

import java.util.ArrayList;

public class ArrayWithSort {
  private ArrayList<Integer> array;
  private SortAlgorithm sortAlgorithm;

  public ArrayWithSort(ArrayList<Integer> array, SortAlgorithm sortAlgorithm) {
    this.array = array;
    this.sortAlgorithm = sortAlgorithm;
  }

  public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }

  public void performSort() {
    sortAlgorithm.sort(array);
  }

  public void printArray() {
    for (Integer i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
