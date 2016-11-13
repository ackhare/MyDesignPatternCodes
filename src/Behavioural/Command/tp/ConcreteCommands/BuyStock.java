package Behavioural.Command.tp.ConcreteCommands;

import Behavioural.Command.tp.Command.Order;
import Behavioural.Command.tp.Stock;

/**
 * Created by chetan on 13/11/16.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
