package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Squeak;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
