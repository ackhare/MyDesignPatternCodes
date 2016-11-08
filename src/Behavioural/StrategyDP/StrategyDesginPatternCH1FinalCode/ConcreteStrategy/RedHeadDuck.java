package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Quack;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyWithWings;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		setFlyBehavior( new FlyWithWings());
		setQuackBehavior(new Quack());
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
