package Strategy.StrategyDesginPatternCH1FinalCode.Context;


import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.FlyBehavior;
import Strategy.StrategyDesginPatternCH1FinalCode.Strategy.QuackBehavior;

/**
 * Created by chetan on 2/11/15.
 */
//THe base class Duck class which ios abstract we r programming to interface
public abstract class Duck {
    FlyBehavior flyBehavior;//interface
    QuackBehavior quackBehavior;//interface

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();//programming to an interface
    }

    public void performQuack() {
        quackBehavior.quack();//programming to an interface
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
