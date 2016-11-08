package Behavioural.Iterator;

import java.util.List;

/**
 * Created by chetan on 2/10/15.
 */
//Java provides an implementation of the Behavioural.Iterator pattern, which provides next() and hasNext() methods
// . Creation of the iterator in Java is typically done through a method named iterator() in the container class.
 //       The following example shows use of an iterator with a list :
//        List<String> list = new ArrayList<String>();
//        //add strings
//        Behavioural.Iterator it = list.iterator();
//        while(it.hasNext()){   String s = it.next();}




interface Channel{

        }



// Now let's go to an example where we create the constructs ourselves, with a remote control example.
//First we'll create an iterator with the standard methods:
//Behavioural.Iterator interface
// The Behavioural.Iterator defines the interface for access and traversal of the elements,
// and the ConcreteIterator implements this interface while keeping track of the current position in the
// traversal of the Aggregate.
interface ChannelIterator {
    public boolean hasNext();

    public void next();

    public String currentItem();
}
//        Next we create the Aggregate interface, in this case a TV.
//Aggregate interface
// The Aggregate defines an interface for the creation of the Behavioural.Iterator object.
interface TV{
    public Channel getIterator();
    //other TV methods
}


//The concrete implementation of the aggregator has the capability to create the iterator
// The ConcreteAggregate implements Aggregate interface, and returns an instance of the ConcreteIterator.
//Concrete Aggregator
//Aggregator is the object jispe iterator lagna hai
class ConcreteTV {
    private ChannelIterator iterator;//has-a relation of concrete aggregator and concrete iterator
    //
    private List<String> channels;

    public ConcreteTV() {
        iterator = new ConcreteChannelIterator(channels);
    }

    public ChannelIterator getIterator() {
        return iterator;
    }
}
//Finally the iterator helps control how we navigate the data.
//Concrete Behavioural.Iterator
//ConcreteIterator implements iterator interface while keeping track of the current position in the traversal of the Aggregate.
class ConcreteChannelIterator implements  ChannelIterator{
    private List<String> channels;
    private int currentPos = 0;

    public ConcreteChannelIterator(List<String> channels) {
        this.channels = channels;
    }

    public boolean hasNext() {
        if (currentPos + 1 < channels.size()) {
            return true;
        }
        return false;
    }

    public void next() {
        currentPos++;
    }

    public String currentItem() {
        return channels.get(currentPos);
    }
}
//Of course this is a one-way remote control.
// We could implement back() and hasBack() methods to navigate backwards in our iterator.
