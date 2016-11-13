package Behavioural.Command.tp.ConcreteCommands;

import Behavioural.Command.tp.Command.Order;
import Behavioural.Command.tp.Stock;

/**
 * Created by chetan on 13/11/16.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
