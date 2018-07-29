package net.q3zeljko.Strategy.Example1.FlyBehaviourImpl;

import net.q3zeljko.Strategy.Example1.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket!");
  }
}
