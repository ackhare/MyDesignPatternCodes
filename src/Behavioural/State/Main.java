package Behavioural.State;

/**
 * Created by chetan on 2/10/15.
 */
//We'll use the state of an mp3 player to give an example of the state pattern in action.
// First we set up a context for our mp3 player.

//Context
//is that object which will change and can have multiple state
class MP3PlayerContext {
 private State state;
 private MP3PlayerContext(State state) {
   this.state= state;
 }
 public void play() {
   state.pressPlay(this);
 }
 public void setState(State state) {
   this.state = state;
 }
 public State getState() {
   return state;
 }
}

//Now we'll create our state interface. In this example, we've just got a play button.
//There can be multiple state
interface State {
 public void pressPlay(MP3PlayerContext context);
}
//And finally, creating a state for Standby and for Playing.
class StandbyState implements State {
 public void pressPlay(MP3PlayerContext context) {
   context.setState(new PlayingState());
 }
}
class PlayingState implements State {
 public void pressPlay(MP3PlayerContext context) {
   context.setState(new StandbyState());
 }
}
