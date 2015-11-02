package Bridge;

/**
 * Created by chetan on 28/9/15.
 */
//So How Does It Work In Java?
//Here's the pattern in action using the remote control example from Head First Design Patterns.
//First, we have our TV implementation interface:

//Implementor
interface TV {
    public void on();

    public void off();

    public void tuneChannel(int channel);
}

// And then we create two specific implementations - one for Sony and one for Philips:
//Concrete Implementor
class Sony implements TV {
    public void on() {
//Sony specific
// on
    }

    public void off() {
//Sony specific off
    }

    public void tuneChannel(int channel) {
//Sony specific tuneChannel
    }
}

//Concrete Implementor
class Philips implements TV {
    public void on() {
// Philips specific on
    }

    public void off() {//Philips specific off
//
    }

    public void tuneChannel(int channel) {
        // /Philips specific tuneChannel}}
    }
}

//     These classes deal with the specific implementations of the TV from each vendor.
//   Now, we create a remote control  abstraction to control the TV:
//Abstraction
abstract class RemoteControl {
    private TV implementor;

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }
}

// As the remote control holds a reference to the TV, it can delegates the methods through to the interface.
// But what is we want a more specific remote control - one that has the + / - buttons for moving through the channels?
// All we need to do is extend our RemoteControl abstraction to contain these concepts:
//Refined abstraction

class ConcreteRemote extends RemoteControl {
    private int currentChannel;

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }
}

class Main{

    public static void main(String[] args) {
        int currentChannel=5;
        ConcreteRemote concreteRemote= new ConcreteRemote();
        concreteRemote.setChannel(currentChannel);
        concreteRemote.nextChannel();
        System.out.println(currentChannel);

    }

}

/*The Abstraction defines the abstraction, and maintains the reference to the implementor.
// So here we say
// private TV implementor;
so this is the refrence to implementor line 54 while abstraction is RemoteControl


 RefinedAbstraction(ConcreteRemote) provides an extension to the Abstraction, usually adding extra methods that provide different ways of getting
 at the same functionality. The Implementor interface defines an interface for the implementation classes (the ConcreateImplementor
 classes).
  */


//Refined Abstractions are implemented in terms of the abstraction, and not that implementation interface
// .This means that the implementation details are hidden from the client.
// The pattern is similar to the Adapter pattern, except the Bridge pattern separates the interface from implementation.