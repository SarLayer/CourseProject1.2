package by.bntu.fitr.povt.sunRevival.Logic.entity;

public class Candy extends Decoration {
    private double weight;

    public Candy() {
        super();
    }

    public Candy(String name,String color, double price, double weight) {
        super(name,color, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Decoration(Candy      " +
                " | weight = " +  this.getWeight() +
                super.toString();
    }
}
