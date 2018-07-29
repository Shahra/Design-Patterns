package net.q3zeljko.Strategy.Example1.FlyBehaviourImpl;

import net.q3zeljko.Strategy.Example1.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("I'm flying with my wings!");
  }
}
