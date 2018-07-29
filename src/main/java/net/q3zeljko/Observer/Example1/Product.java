package net.q3zeljko.Observer.Example1;

import java.util.ArrayList;

public class Product implements Observable {
  private ArrayList<Observer> observers;
  private String productName;
  private Integer price;
  private Boolean available;

  public Product(String productName, Integer price, Boolean available) {
    this.productName = productName;
    this.price = price;
    this.available = available;
    observers = new ArrayList<>();
  }

  public void setPrice(Integer price) {
    if(!price.equals(this.price)) {
      this.price = price;
      notifyObservers();
    }
  }

  public void setAvailable(Boolean available) {
    if(!available.equals(this.available)) {
      this.available = available;
      notifyObservers();
    }
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void registerObserver(Observer o) {
    if(!observers.contains(o)) {
      observers.add(o);
    }
  }

  @Override
  public void notifyObservers() {
    for(Observer o : observers) {
      o.update(productName, price, available);
    }
  }
}
