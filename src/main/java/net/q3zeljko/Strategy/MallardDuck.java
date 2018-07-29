package net.q3zeljko.Strategy;

import net.q3zeljko.Strategy.FlyBehaviourImpl.FlyWithWings;
import net.q3zeljko.Strategy.QuackBehaviourImpl.Squeak;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new FlyWithWings(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck!");
    }
}
