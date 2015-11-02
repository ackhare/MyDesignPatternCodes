package Strategy.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Strategy.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Strategy.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;
import Strategy.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyWithWings;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		setFlyBehavior( new FlyWithWings());
		setQuackBehavior(new Quack());
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
