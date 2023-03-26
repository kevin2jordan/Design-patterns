package DesignPatterns.Creational.Prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return clone;
    }
}
