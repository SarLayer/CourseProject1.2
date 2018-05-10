package by.bntu.fitr.povt.sunRevival.Logic;

import by.bntu.fitr.povt.sunRevival.Logic.entity.Ball;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Candy;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Flashlight;

public class God {
    public static Decoration greate(String name)
    {
        Decoration decoration = null;
        switch (name)
        {
            case "Ball1": decoration = new Ball("Ball1","Red",5.5,30); break;
            case "Ball2": decoration = new Ball("Ball2","Green",3,40); break;
            case "Ball3": decoration = new Ball("Ball3","Blue",4,34); break;
            case "Candy1": decoration = new Candy("Candy1","Red-White",8,60); break;
            case "Candy2": decoration = new Candy("Candy2","Green-White",7,50); break;
            case "Candy3": decoration = new Candy("Candy3","White-Red-Green",6.8,30); break;
            case "Flashlight1": decoration = new Flashlight("Flashlight1","Blue",8,50); break;
            case "Flashlight2": decoration = new Flashlight("Flashlight2","Green",7,50); break;
            case "Flashlight3": decoration = new Flashlight("Flashlight3","Red",6,450); break;
        }
        return decoration;

    }
}
