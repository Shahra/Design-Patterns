package net.q3zeljko.Strategy;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void swim() {
        System.out.println("I am swimming right now!");
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
