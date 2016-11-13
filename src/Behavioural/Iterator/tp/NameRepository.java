package Behavioural.Iterator.tp;

/**
 * Created by chetan on 13/11/16.
 */
/*
Create concrete class implementing the Container interface.
This class has inner class NameIterator implementing the Iterator interface.
 */
public class NameRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator(names);
   }


}