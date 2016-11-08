package Behavioural.StrategyDP.tp.Strategy;

import Behavioural.StrategyDP.tp.StrategyI;

/**
 * Created by chetan on 8/11/16.
 */
public class OperationSubstract implements StrategyI {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
