package Behavioural.Iterator.tp;

/**
 * Created by chetan on 13/11/16.
 */
public class NameIterator implements Iterator {

    public String names[];


    int index;

    public NameIterator(String[] names) {
        this.names=names;
    }

    @Override
    public boolean hasNext() {

        if(index < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
