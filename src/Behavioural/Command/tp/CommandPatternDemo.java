package Behavioural.Command.tp;

import Behavioural.Command.tp.ConcreteCommands.BuyStock;
import Behavioural.Command.tp.ConcreteCommands.SellStock;

/**
 * Created by chetan on 13/11/16.
 */
//Use the Broker class to take and execute commands.
public class CommandPatternDemo {
    public static void main(String[] args) {
        //instantiate the request class
        Stock abcStock = new Stock();

        //coincrete commands are given the request instance so that a concrete command could
        // be given to broker which can take and place order
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
