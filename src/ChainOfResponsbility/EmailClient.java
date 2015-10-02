package ChainOfResponsbility;

/**
 * Created by chetan on 28/9/15.
 */
//Now let's take a look at how we might implement the Chain of Responsibility with a code example.
// Let's use an email client as an example.
// You might set up some rules to move a message into a particular folder depending on who it's from.
class Email {
    String from;

    public String getFrom() {
        return from;
    }
}

// First we'll need to create our EmailHandler interface.
//Handler
interface EmailHandler {
    //reference to the next handler in the chain
    public void setNext(EmailHandler handler);

    //handle request
    public void handleRequest(Email email);
}

//Now let's set up two concrete handlers, one for business mail and one for email originating from Gmail.
// These handlers pass on the request if it doesn't interest them
class BusinessMailHandler implements EmailHandler {
    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@businessaddress.com")) {
            next.handleRequest(email);
        } else {
            //handle request (move to correct folder)

        }
    }
}

class GMailHandler implements EmailHandler {
    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@gmail.com")) {
            next.handleRequest(email);
        } else {
            //handle request (move to correct folder)
            //
        }
    }
}

//Now let's set up a client that manages the handlers - this will actually be our EmailProcessor.
class EmailProcessor {
    private EmailHandler prevHandler;

    //maintain a reference to the previous handler so we can add the next one
    public void addHandler(EmailHandler handler) {
        if (prevHandler != null) {
            prevHandler.setNext(handler);
        }
        prevHandler = handler;
    }

    public void handleRequest(Email handler) {
//
    }
}
// This class allows us to add in new handlers at any stage.
// Finally, the email client itself uses the EmailProcessor to look after all incoming messages

//email client
public class EmailClient {
    private EmailProcessor processor;

    public EmailClient() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new EmailProcessor();
        processor.addHandler(new BusinessMailHandler());
        processor.addHandler(new GMailHandler());
    }

    public void addRule(EmailHandler handler) {
        processor.addHandler(handler);
    }

    public void emailReceived(Email email) {
        processor.handleRequest(email);
    }

    public static void main(String[] args) {
        EmailClient client = new EmailClient();
    }
}
//If new rules, for forwarding email to particular folders are added,
// we can add the handler to our email processor at runtime using the addRule() method in the client.
