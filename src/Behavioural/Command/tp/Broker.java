package Behavioural.Command.tp;

/**
 * Created by chetan on 13/11/16.
 */
import Behavioural.Command.tp.Command.Order;

import java.util.ArrayList;
import java.util.List;
//Create command invoker class.
//Again it is a independent class which glues and serves as a layer between the
// Command excuter clasas and the request class on which request is to be made
//The nature of this class as a mediator can be judged via uml diagram in doc
public class Broker {
    //Important thing to note that though on right hand side of any instantiation we used a concrete class
    // but in generics a concrete classs
    //can be used
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        //all commands are queued in a list which will be executed
        orderList.add(order);
    }

    public void placeOrders(){
//again the respective concrete rder will be taken out and excute method is called
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
