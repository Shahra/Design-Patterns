package net.q3zeljko.Observer.Example2;

import java.util.Observable;

public class Product extends Observable {
  private String productName;
  private Integer price;
  private Boolean available;

  public Product(String productName, Integer price, Boolean available) {
    this.productName = productName;
    this.price = price;
    this.available = available;
  }

  public String getProductName() {
    return productName;
  }

  public Integer getPrice() {
    return price;
  }

  public Boolean getAvailable() {
    return available;
  }

  public void setPrice(Integer price) {
    if(!price.equals(this.price)) {
      this.price = price;
      setChanged();
      notifyObservers("Price " + this.price.toString());
    }
  }

  public void setAvailable(Boolean available) {
    if(!available.equals(this.available)) {
      this.available = available;
      setChanged();
      notifyObservers("Available " + this.available.toString());
    }
  }
}
