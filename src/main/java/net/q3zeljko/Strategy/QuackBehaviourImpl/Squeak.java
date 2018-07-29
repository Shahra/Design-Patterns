package net.q3zeljko.Strategy.QuackBehaviourImpl;

import net.q3zeljko.Strategy.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
