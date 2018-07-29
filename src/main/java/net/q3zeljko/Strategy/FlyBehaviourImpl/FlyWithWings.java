package net.q3zeljko.Strategy.FlyBehaviourImpl;

import net.q3zeljko.Strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with my wings!");
    }
}
