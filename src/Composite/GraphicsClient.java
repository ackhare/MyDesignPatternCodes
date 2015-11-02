package Composite;

/**
 * Created by chetan on 28/9/15.
 */
//Graphics is a great example of how the Composite pattern works,
// so I'll use that here. First, we create an general interface for our graphics object.
// The main thing is that we have a paint method.
// Each graphic could be composed of other graphics too, so we'll need to provide a way to contain these objects.
//Component

import java.util.ArrayList;
import java.util.List;

interface Graphic {
    public void add(Graphic g);

    public void remove(Graphic g);

    public Graphic get(int index);

    public void paint();
}

// Next, we'll implement this interface for CompositeGraphic objects.
// The key point to note here is that it's paint method delegates the painting to children objects:
//Composite
class CompositeGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<Graphic>();

    public void paint() {
        //run the paint operation for each child
        for (Graphic g : children) {
            g.paint();
        }
    }

    public void add(Graphic g) {
        children.add(g);
    }

    public void remove(Graphic g) {
        if (children.contains(g)) {
            children.remove(g);
        }
    }

    public Graphic get(int index) {
        Graphic graphic = null;
        if (index < children.size()) {
            graphic = children.get(index);
        }
        return graphic;
    }
}

//        The leaf, in this case SimpleGraphic, cannot contain other graphics,
// so it doesn't need to implement the list operations. The most important this is that it
// provides a concrete implementation of the paint() method:

//Leaf
class SimpleGraphic implements Graphic {
    public void paint() {
        //run the paint operation}

    }

    // Because we have no children, these operations will do nothing
    public void add(Graphic g) {//unsupported operation}
    }

    public void remove(Graphic g) {
        //unsupported operation}
    }

    public Graphic get(int index) {
        //unsupported operation}
        return null;
    }
}

//        And finally, for the client, things couldn't be easier.
// All they need to do is to know about the interface, and all the work is done for them:
//Client.
public class GraphicsClient {
    /**
     * Given a graphics context, client can just call paint, without worrying if this is a composite or leaf
     **/

    public void paint(Graphic g) {
        g.paint();
    }
}
