package by.bntu.fitr.povt.sunRevival.Logic.entity;


public class Flashlight extends Decoration {
    private double size;

    public Flashlight() {
        super();
    }

    public Flashlight(String name,String color, double price, double size) {
        super(name,color, price);
        this.size = size;

    }


    @Override
    public String toString() {
        return "Decoration(Flashlight " +
                " | Size =    " + this.getSize() +
                super.toString();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
