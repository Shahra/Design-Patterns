package net.q3zeljko.Strategy.Example1.FlyBehaviourImpl;

import net.q3zeljko.Strategy.Example1.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("I can't fly!");
  }
}
