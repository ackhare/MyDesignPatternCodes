package Command;

/**
 * Created by chetan on 2/10/15.
 */



/*
Command declares an interface for all commands, providing a simple execute() method which asks the Receiver of
the command to carry out an operation.
The Receiver has the knowledge of what to do to carry out the request.
 The Invoker holds a command and can get the Command to execute a request by calling the execute method.
 The Client creates ConcreteCommands and sets a Receiver for the command.
  The ConcreteCommand defines a binding between the action and the receiver.
  When the Invoker calls execute the ConcreteCommand will run one or more actions on the Receiver.
 */
//First we'll create our command interface:
//Command
interface Command{
    public void execute();
}

//Now let's create two concrete commands. One will turn on the lights, another turns off lights:
//Concrete Command
class LightOnCommand implements Command{
    //reference to the light
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
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
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
