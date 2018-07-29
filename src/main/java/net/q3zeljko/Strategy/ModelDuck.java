package net.q3zeljko.Strategy;

import net.q3zeljko.Strategy.FlyBehaviourImpl.FlyNoWay;
import net.q3zeljko.Strategy.QuackBehaviourImpl.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a Model duck!");
    }
}
