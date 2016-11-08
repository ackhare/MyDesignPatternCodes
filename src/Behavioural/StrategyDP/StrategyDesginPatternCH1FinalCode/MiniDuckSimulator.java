package Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode;

import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.DecoyDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.MallardDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.ModelDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.ConcreteStrategy.RubberDuck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.Context.Duck;
import Behavioural.StrategyDP.StrategyDesginPatternCH1FinalCode.EncapsulatedBehaviour.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
