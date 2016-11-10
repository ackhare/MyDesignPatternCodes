package Creational.Prototype.tp;

/**
 * Created by chetan on 10/11/16.
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            System.out.println(super.toString());
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}