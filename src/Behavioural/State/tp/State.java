package Behavioural.State.tp;

/**
 * Created by chetan on 10/11/16.
 */
public interface State {

    //An action which is passed a Context
    //context object whose behavior varies as its state object changes.
    //to note is the word behaviour
    public void doAction(Context context);
}