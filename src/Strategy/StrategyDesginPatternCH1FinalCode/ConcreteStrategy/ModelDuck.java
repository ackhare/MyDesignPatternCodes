package Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyWithWings;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
