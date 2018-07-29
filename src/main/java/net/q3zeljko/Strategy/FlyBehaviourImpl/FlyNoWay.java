package net.q3zeljko.Strategy.FlyBehaviourImpl;

import net.q3zeljko.Strategy.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
