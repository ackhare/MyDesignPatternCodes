package Behavioural.Mediator;

import java.util.ArrayList;

//Here we'll use the Behavioural.Mediator pattern in the context of a chatroom application.
// First we'll define an interface for our mediator
//Behavioural.Mediator interface
interface Mediator {
    public void send(String message, Colleague colleague);
}

//So its more like observer where a entity sends and another entity recieves

//While we described the Colleague as an interface above,
// it's more useful to use an abstract class in this case:
//Colleage interface
abstract class Colleague {//objects that want to communicate
    private Mediator mediator;//has-a with mediator
    public Colleague(Mediator m) {
        mediator = m;
    }
    //send a message via the mediator
    public void send(String message) {
        //this is the College object associated with
        mediator.send(message, this);
    }
    //get access to the mediator
    public Mediator getMediator() {
        return mediator;
    }
    public abstract void receive(String message);
}

//Now let's create our concrete mediator implementation
class ApplicationMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    public void send(String message, Colleague originator) {

        //let all other screens know that this screen has changed
        for (Colleague colleague : colleagues) {
            //don't tell ourselves
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}

//Finally we'll create one concrete colleage.
class ConcreteColleague extends Colleague {
    Mediator mediator;

    public ConcreteColleague(Mediator m) {
        super(m);
        mediator = m;
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}

//If we assume that we could have many different colleagues
// that react differently when a message is received, this pattern fits in well.
// For example, we could have a mobileColleague that needs to display the message differently to the desktop colleague.
class MobileColleague extends Colleague {
    Mediator mediator;

    public MobileColleague(Mediator m) {
        super(m);
        mediator = m;
    }

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}

//Here's a client that drives the entire application:
public class Client {
    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}
