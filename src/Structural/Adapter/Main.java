package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chetan on 27/9/15.
 */
//The following example shows a simple implementation of the pattern.
// Consider that we have a third party library that provides sorting
// functionality through it's NumberSorter class. This is our Adaptee.
// This is our adaptee, a third party implementation of a   number sorter that deals with Lists, not arrays.

class NumberSorter {
    public List<Integer> sort(List<Integer> numbers) {
        //sort and return
        return new ArrayList<Integer>(numbers);
    }
}
// Our Client deals with primitive arrays rather than Lists. For the sake of this example, lets say we can't change the client
// to use Lists
public class Main {
public static void main(String[]args)
{
        int[]numbers=new int[]{34,2,4,12,1};
        Sorter sorter=new SortListAdapter();
        sorter.sort(numbers);
        }
        }

//We've provided a Sorter interface that expects the client input. This is our target.
//this is our Target interface
interface Sorter {
    public int[] sort(int[] numbers);
}
//Finally, the SortListAdapter implements our target interface and deals with our adaptee, NumberSorter

class SortListAdapter implements Sorter {
    @Override
    public int[] sort(int[] numbers) {
        //convert the array to a List
        List<Integer> numberList = new ArrayList<Integer>();
        //call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);
        int[] numberArray= new int[10];
        int c=0;
        for(int i:numberList)
         {
             numberArray[c]=i;
             c++;
         }
        //convert the list back to an array and return
        return numberArray;
    }
}

