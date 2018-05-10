package by.bntu.fitr.povt.sunRevival.Logic.entity;

public class Ball extends Decoration {
    private double diametr;


    public Ball() {
        super();
    }

    public Ball(String name,String color, double price, double diametr) {
        super(name,color, price);
        this.diametr = diametr;

    }


    @Override
    public String toString() {
        return "Decoration(Ball       " +
                " | Diametr=  " + String.format("%3.1f", this.getDiametr()) +
                super.toString();
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }
}
