package net.q3zeljko.Observer.Example1;

public interface Observable {
  void removeObserver(Observer o);

  void registerObserver(Observer o);

  void notifyObservers();
}
