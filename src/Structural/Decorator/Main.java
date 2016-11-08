package Structural.Decorator;

/**
 * Created by chetan on 28/9/15.
 */
//So How Does It Work In Java?
/*        You'll see decorators being used in Java I/O streams.
Stream classes extend the base subclasses to add features to the stream classes.


        In our example, we'll use emails to illustrate the Structural.Decorator.
        First we have an email interface, which has a getContents method:
*/
interface IEmail {
    public String getContents();
}

//And we'll provide a concrete implementation for use:
//concrete component
class Email implements IEmail {
    private String content;

    public Email(String content) {
        this.content = content;
    }

    @Override
    public String getContents() {
        //general email stuff
        return content;
    }
}

// Now we'll create a decorator which will wrap the base email with extra functionality.
// We'll model this as an abstract class, and maintain a reference to the base email.
abstract class EmailDecorator implements IEmail {
 //wrapped component
    IEmail originalEmail;//as in uml we saw decorator had a refrence to interface and also extends it so both is-a has-a is there
}

//Let's say that emails that leave the company internal server need to have a disclaimer added to the end.
// We can just add in a decorator to handle this:

//concrete decorator
class ExternalEmailDecorator extends EmailDecorator {
    private String content;

    public ExternalEmailDecorator(IEmail basicEmail) {
        originalEmail = basicEmail;
    }

    @Override
    public String getContents() {            //  secure original
        content = addDisclaimer(originalEmail.getContents());
        return content;
    }

    private String addDisclaimer(String message) {      //append company disclaimer to message
        return message + "\n Company Disclaimer";
    }
}

//And if we wanted to create secure, encrypted messages, we could use another decorator:
//concrete decorator
class SecureEmailDecorator extends EmailDecorator {
    private String content;

    public SecureEmailDecorator(IEmail basicEmail) {
        originalEmail = basicEmail;
    }

    @Override
    public String getContents() {
        //  secure original
        content = encrypt(originalEmail.getContents());
        return content;
    }

    private String encrypt(String message) {
        //encrypt the string
        String encryptedMessage=message;
        return encryptedMessage;
    }
}
//So, if our email sending client detects this message is going outside the company,
// we can invoke the appropriate decorator before sending:

class EmailSender {
    public void sendEmail(IEmail email) {
        //read the email to-address, to see if it's going outside of the company
        // if so decorate it
        ExternalEmailDecorator external = new ExternalEmailDecorator(email);
        external.getContents();      //send
    }
}

