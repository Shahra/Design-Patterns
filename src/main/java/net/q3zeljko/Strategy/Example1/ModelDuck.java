package net.q3zeljko.Strategy.Example1;

import net.q3zeljko.Strategy.Example1.FlyBehaviourImpl.FlyNoWay;
import net.q3zeljko.Strategy.Example1.QuackBehaviourImpl.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    super(new FlyNoWay(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("I am a Model duck!");
  }
}
