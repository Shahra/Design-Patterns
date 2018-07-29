package net.q3zeljko.Strategy.Example2.SortAlgorithmImpl;

import net.q3zeljko.Strategy.Example2.SortAlgorithm;

import java.util.ArrayList;

public class DescendingOrderSort implements SortAlgorithm {
  @Override
  public void sort(ArrayList<Integer> array) {
    for (int i = 0; i < array.size(); i++) {
      for (int j = i + 1; j < array.size(); j++) {
        if (array.get(i) < array.get(j)) {
          Integer temp = array.get(i);
          array.set(i, array.get(j));
          array.set(j, temp);
        }
      }
    }
  }
}
