package Visitor;

import java.util.ArrayList;

/**
 * Created by chetan on 2/10/15.
 */
//Let's create a seperate visitor for each postal region.
// This way, we can seperate the logic of calculating the total postage cost from the items themselves.
// This means that our individual elements don't need to know anything about the postal cost policy,
// and therefore, are nicely decoupled from that logic.

//First, let's create our general visitable  interface:
//Element interface
interface Visitable{
 public void accept(Visitor visitor);
}
//Now, we'll create a concrete implementation of our interface, a Book.
//concrete element
class Book implements Visitable{
 Visitor visitor;
 private double price;
 private double weight;
 //accept the visitor
 public void accept(Visitor vistor) {
   visitor.visit(this);
 }
 public double getPrice() {
   return price;
 }
 public double getWeight() {
   return weight;
 }
}

//As you can see it's just a simple POJO, with the extra accept method added to allow the visitor access to the element.
// We could add in other types here to handle other items such as CDs, DVDs or games.


//Now we'll move on to the Visitor interface. For each different type of concrete element here,
// we'll need to add a visit method. As we'll just deal with Book for now, this is as simple as:
interface Visitor{
 public void visit(Book book);
  //visit other concrete items
// public void visit(CD cd);
// public void visit(DVD dvd);
}
//The implementation of the Vistor can then deal with the specifics of what to do when we visit a book.
class PostageVisitor implements Visitor {
 private double totalPostageForCart;
 //collect data about the book
 public void visit(Book book) {
   //assume we have a calculation here related to weight and price
   //free postage for a book over 10
   if(book.getPrice() < 10.0) {
     totalPostageForCart += book.getWeight() * 2;
   }
 }
 //add other visitors here
// public void visit(CD cd) {}
// public void visit(DVD dvd) {}
 //return the internal state
 public double getTotalPostage() {
   return totalPostageForCart;
 }
}
//As you can see it's a simple formula, but the point is that all the calculation for book postage is done in one central place.
//To drive this visitor, we'll need a way of iterating through our shopping cart, as follows:
class ShoppingCart {
 //normal shopping cart stuff
 private ArrayList<Visitable> items;
 public double calculatePostage() {
   //create a visitor
   PostageVisitor visitor = new PostageVisitor();
   //iterate through all items
   for(Visitable item: items) {
     item.accept(visitor);
   }
   double postage = visitor.getTotalPostage();
   return postage;
 }
}
//Note that if we had other types of item here, once the visitor implements a method to visit that item,
// we could easily calculate the total postage.

