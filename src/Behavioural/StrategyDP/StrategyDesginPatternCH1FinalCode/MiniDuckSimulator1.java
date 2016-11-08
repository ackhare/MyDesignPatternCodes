package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.MallardDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.ModelDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
