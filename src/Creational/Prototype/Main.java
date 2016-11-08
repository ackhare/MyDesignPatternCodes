package Creational.Prototype;

import java.util.Hashtable;

/**
 * Created by chetan on 26/9/15.
 */
//Let's use a simple example in Java to illustrate this
// pattern.
// For this example, let's use a shopping cart example. Let's say that we have a number of items that can go in the cart - books, cds, dvds.
// While our example doesn't include anything that's particularly expensive to create, it should illustrate how the pattern works.


 //Starts with Item class

        //Next we'll create two ConcretePrototypes
//Concrete Prototypes
        class Book extends Item{  //extra book stuff
 }

class CD extends Item{  //extra cd stuff

//
}
        //Now let's create a registry for item creation

/*
ConcretePrototype implements the operation for cloning itself.

In practice you will add in a registry to manage the finding and cloning of the objects.
 */
         class ItemRegistry {
            private Hashtable map = new Hashtable();
            public ItemRegistry()
            {
                loadCache();
            }

             public Item createBasicItem(String type) {
                Item item=(Item)map.get(type);
                 return item.clone();
            }

            private void loadCache() {
                Book book = new Book();
                book.setTitle("Design Patterns");
                book.setPrice(20.00);
                map.put("Book", book);
                CD cd = new CD();
                cd.setTitle("Various");
                cd.setPrice(10.00);
                map.put("CD", cd);
            }
        }


//Finally, here's a Client that makes use of the Creational.Prototype.
// If we need to create a book, we can use the cached implementation to load it up, and modify it after.
public class Main {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        //here a book item is being created without using new
        Book myBook = (Book)registry.createBasicItem("Book");
        myBook.setTitle("Custom Title");
         //etc
         //
    }}

