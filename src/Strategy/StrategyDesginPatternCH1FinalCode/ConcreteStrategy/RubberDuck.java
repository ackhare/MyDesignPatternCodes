package Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Squeak;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
