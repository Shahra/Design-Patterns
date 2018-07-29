package net.q3zeljko.Strategy.FlyBehaviourImpl;

import net.q3zeljko.Strategy.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
