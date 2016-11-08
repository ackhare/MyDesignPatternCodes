package Creational.Prototype;

/**
 * Created by chetan on 27/9/15.
 */
//First, we'll create an abstract class for our Item, which will be our Creational.Prototype that includes a clone method.
//Creational.Prototype
public abstract class Item{
    private String title;
    private double price;
    public Item clone()
    {
        Item clonedItem = null;
        try {
            //use default object clone.
            clonedItem = (Item) super.clone();
            //specialised clone
            clonedItem.setPrice(price);
            clonedItem.setTitle(title);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } //catch
        return clonedItem;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price=price;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public double getPrice() {
        return price;
    }
}

