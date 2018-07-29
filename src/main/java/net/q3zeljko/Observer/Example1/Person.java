package net.q3zeljko.Observer.Example1;

public class Person implements Observer {
  private String username;

  public Person(String username) {
    this.username = username;
  }

  @Override
  public void update(String productName, Integer price, Boolean available) {
    System.out.println("-----------------------");
    System.out.println(username + " : I got message that the " + productName + " has updated its properties!");
    System.out.println("Price : " + price + "   Availability : " + available.toString());
  }
}
