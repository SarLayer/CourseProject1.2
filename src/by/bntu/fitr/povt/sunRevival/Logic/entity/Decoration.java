package by.bntu.fitr.povt.sunRevival.Logic.entity;

public class Decoration {
    public String getName() {
        return name;
    }

    private String color;
    private double price;
    private String name;


    public Decoration() {
    }


    protected Decoration(String name,String color, double price) {
        this.color = color;
        this.price = price;
        this.name =name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return  " | Color = " + color +
                " | Price = " + price +
                "}\n";
    }
}
