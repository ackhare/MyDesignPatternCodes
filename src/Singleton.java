/**
 * Created by chetan on 27/9/15.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//access the singleton

//Singleton singleton = Singleton.getInstance();//use the singleton