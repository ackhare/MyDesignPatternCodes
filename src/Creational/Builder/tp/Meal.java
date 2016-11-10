package Creational.Builder.tp;

/**
 * Created by chetan on 10/11/16.
 */

import java.util.ArrayList;
import java.util.List;

public class Meal {

    //It is used as a mediator class or as a helper just to add and get item when needed
    //As this does effectively what map does it could have been eliminated but for sake of avoiding complexity
    //it is used

    //here the array list was not static but to avoid confusion I have done static
    private static List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
