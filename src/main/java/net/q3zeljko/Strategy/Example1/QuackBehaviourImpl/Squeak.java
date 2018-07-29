package net.q3zeljko.Strategy.Example1.QuackBehaviourImpl;

import net.q3zeljko.Strategy.Example1.QuackBehaviour;

public class Squeak implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
