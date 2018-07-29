package net.q3zeljko.Observer.Example1;

public interface Observer {
  void update(String productName, Integer price, Boolean available);
}
