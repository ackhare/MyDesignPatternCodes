package FlyWeight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 28/9/15.
 */

/*
Let's use drawing lines of different colors as an example here.
 We want to avoid creating a new line for each color, instead choosing to reuse lines with the same color.
 */

//First, we'll create an interface for our flyweights.
// The draw method provides the extrinsic data of where to draw the line
//Flyweight
//The Flyweight interface declares methods which flyweight instances can receive and use extrinsic(information that can be passed in through arguments.) data.
interface LineFlyweight {
    public Color getColor();

    public void draw(Point location);
}

//The line will implement this interface:
//Intrinsic data is the data that makes this object instance unique. Meanwhile,
// extrinsic data is information that can be passed in through arguments.
//ConcreteFlyweight
//ConcreteFlyweight adds capabilities for intrinsic( data that makes this object instance unique.) state. This flyweight object must be sharable.
class Line implements LineFlyweight {
    private Color color;

    public Line(Color c) {
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Point location) {
        // /draw the character on screen
    }
}

//Our factory will manage the creation of the line objects:
//Flyweight factory
//The FlyweightFactory is responsible for the creation and management of the flyweights(line objects),
// ensuring that they are shared properly. If the desired Flyweight isn't created  it will create and return one.
// Otherwise, it will return one from the current pool of flyweights.
class LineFlyweightFactory {
    private List<LineFlyweight> pool;

    public LineFlyweightFactory()
    {
        pool = new ArrayList<LineFlyweight>();
    }

    public LineFlyweight getLine(Color c) {
        //check if we've already created a line with this color
        for (LineFlyweight line : pool) {
            if (line.getColor().equals(c)) {
                return line;
            }
        }
        //if not, create one and save it to the pool
        LineFlyweight line = new Line(c);
        pool.add(line);
        return line;

    }
}

// When the client wants to create a line, they can just use the factory as follows:
public class Main {
    public static void main(String[] args) {
        LineFlyweightFactory factory = new LineFlyweightFactory();
        LineFlyweight line = factory.getLine(Color.RED);
        LineFlyweight line2 = factory.getLine(Color.RED);
        //can use the lines independently
        line.draw(new Point(100, 100));
        line2.draw(new Point(200, 100));
    }


}
