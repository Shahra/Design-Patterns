package net.q3zeljko.Observer.Example2;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
  private String username;

  public Person(String username) {
    this.username = username;
  }

  @Override
  public void update(Observable o, Object arg) {
    System.out.println(username);
    if(o instanceof Product) {
      System.out.println(((Product) o).getProductName() + " has been updated! " + arg);
    }
    System.out.println();
  }
}
