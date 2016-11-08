package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
