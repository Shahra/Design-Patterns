package net.q3zeljko.Strategy.Example2;

import net.q3zeljko.Strategy.Example2.SortAlgorithmImpl.AscendingOrderSort;
import net.q3zeljko.Strategy.Example2.SortAlgorithmImpl.DescendingOrderSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

  public void PrintAfterSort(ArrayWithSort arr) {
    System.out.println("-----------------------");
    arr.performSort();
    arr.printArray();
  }

  @org.junit.Test
  public void SimpleTest() {
    SortAlgorithm desc = new DescendingOrderSort();
    SortAlgorithm asc = new AscendingOrderSort();
    ArrayWithSort arrayWithSort = new ArrayWithSort(new ArrayList<>(Arrays.asList(5, 2, 3)), desc);
    arrayWithSort.printArray();
    PrintAfterSort(arrayWithSort);
    arrayWithSort.setSortAlgorithm(asc);
    PrintAfterSort(arrayWithSort);
  }
}
