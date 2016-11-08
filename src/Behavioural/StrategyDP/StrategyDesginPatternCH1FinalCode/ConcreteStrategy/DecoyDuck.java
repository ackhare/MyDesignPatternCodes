package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy;


import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyNoWay;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
