package net.q3zeljko.Strategy;

import net.q3zeljko.Strategy.FlyBehaviourImpl.FlyWithRocket;

public class Test {

    public void TestDuck(Duck duck) {
        System.out.println("-----------------------");
        duck.display();
        duck.swim();
        duck.fly();
        duck.quack();
    }

    @org.junit.Test
    public void SimpleTest() {
        Duck mallardDuck = new MallardDuck();
        Duck modelDuck = new ModelDuck();
        TestDuck(mallardDuck);
        TestDuck(modelDuck);
        modelDuck.setFlyBehaviour(new FlyWithRocket());
        TestDuck(modelDuck);
    }
}
