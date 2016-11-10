package Creational.Builder.tp;

/**
 * Created by chetan on 10/11/16.
 */
public interface Item {
    public String name();
    // Packing is associated with burger at highest possible abstract ness
    // level so that decoupling is best achieved
    public Packing packing();
    public float price();
}
