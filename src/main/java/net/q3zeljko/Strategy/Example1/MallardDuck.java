package net.q3zeljko.Strategy.Example1;

import net.q3zeljko.Strategy.Example1.FlyBehaviourImpl.FlyWithWings;
import net.q3zeljko.Strategy.Example1.QuackBehaviourImpl.Squeak;

public class MallardDuck extends Duck {
  public MallardDuck() {
    super(new FlyWithWings(), new Squeak());
  }

  @Override
  public void display() {
    System.out.println("I am a Mallard duck!");
  }
}
