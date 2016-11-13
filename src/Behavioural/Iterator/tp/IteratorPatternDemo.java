package Behavioural.Iterator.tp;

/**
 * Created by chetan on 13/11/16.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
//container which containes the iterator is called which gives the iterator which is instantiated in concrete container
        //
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
/*
output

Name : Robert
Name : John
Name : Julie
Name : Lora

 */