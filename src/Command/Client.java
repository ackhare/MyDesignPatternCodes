package Command;

/**
 * Created by chetan on 2/10/15.
 */



/*


 */

//First we'll create our command interface:
//Command declares an interface for all commands, providing a simple execute() method which asks the Receiver of
//the command to carry out an operation.The Receiver has the knowledge of what to do to carry out the request.
interface Command{
    public void execute();
}

//Now let's create two concrete commands. One will turn on the lights, another turns off lights:
//Concrete Command
// The Client creates ConcreteCommands and sets a Receiver for the command.
//The ConcreteCommand defines a binding between the action and the receiver.
class LightOnCommand implements Command{
    //reference to the light
    Light light;//reciever
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();  //The ConcreteCommand defines a binding between the action and the receiver.

    }
}

//Concrete Command
class LightOffCommand implements Command{
    //reference to the light
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}

//Light is our receiver class, so let's set that up now:
//Receiver
//The Receiver has the knowledge of what to do to carry out the request.
class Light{
    private boolean on;
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }
}

//Our invoker in this case is the remote control.
//Invoker
// The Invoker holds a command(has-A) and can get the Command to execute a request by calling the execute method.
//  When the Invoker calls execute the ConcreteCommand will run one or more actions on the Receiver.
class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}

//Finally we'll set up a client to use the invoker
//Client
public class Client{
    public static void main(String[] args)    {
        RemoteControl control = new RemoteControl();//Invoker
        Light light = new Light();//Reciever
        Command lightsOn = new LightOnCommand(light);//ConcreteCommands

        //The Client creates ConcreteCommands and sets a Receiver for the command.
        Command lightsOff = new LightOffCommand(light);//ConcreteCommands
        //switch on
        control.setCommand(lightsOn);
        // The Invoker holds a command and can get the Command to execute a request by calling the execute method
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
