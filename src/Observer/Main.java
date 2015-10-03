package Observer;

/**
 * Created by chetan on 2/10/15.
 */
//Let's take a look at an implementation of the pattern with a real example. In our example,
// the subject will be a DataStore, with a Screen class as the observer.
//First, let's make our DataStore class observable by extending the java.util.Observable class.
// This means that our DataStore has all the methods and functionality available to make it a Subject,
// according to our pattern.

import java.util.Observable;
import java.util.Observer;

class DataStore extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        //mark the observable as changed
        setChanged();
    }
}

//You'll notice that we have called the setChanged() method of the Observable.
// This is necessary in order for the call to notify observers to send out the update.
// Without this set, the Observable will see no reason to send out the update.
// Next, let's create our Observer. To do this, all we need to do is implement the Observer
// interface which forces us to write an update method, to deal with changes in the Observable's state.
class Screen implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //act on the update
    }
}

class Main {
    public static void main(String[] args) {
        //Adding our Screen as an observer to the DataStore is simple:
        Screen screen = new Screen();
        DataStore dataStore = new DataStore();
//register observer
        dataStore.addObserver(screen);
        // When the data changes, we want to notify all observers of this object.
        //To do this, we just need to call the notifyObservers method when we want an update sent out
//send a notification
        dataStore.notifyObservers();
//        As you can see it's a really simple pattern to understand,
// and even easier to use thanks to the Java implementation of the pattern.
    }

}