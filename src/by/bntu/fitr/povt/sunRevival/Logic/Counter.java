package by.bntu.fitr.povt.sunRevival.Logic;


import by.bntu.fitr.povt.sunRevival.Logic.entity.Ball;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Candy;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Flashlight;

import java.util.Map;

public class Counter {
    public static double countPriceOfTree(Map<Integer, Decoration> dictionary) {
        double price = 0;
        for (Decoration decoration : dictionary.values()) {
            
            price += decoration.getPrice();
        }
        return price;
    }
    
    public static double countPriceOfBall(Map<Integer, Decoration> dictionary) {
        double price = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Ball) {
                price += decoration.getPrice();
            }
        }
        return price;
        
    }
    
    public static double countPriceOfCandy(Map<Integer, Decoration> dictionary) {
        double price = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Candy) {
                price += decoration.getPrice();
            }
        }
        return price;
        
    }
    
    public static double countPriceOfFlashLight(Map<Integer, Decoration> dictionary) {
        double price = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Flashlight) {
                price += decoration.getPrice();
            }
        }
        return price;
        
    }
    
    public static double countPercentOfBall(Map<Integer, Decoration> dictionary) {
        double count = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Ball) {
                count += 1;
            }
        }
        return (count / dictionary.size());
    }
    
    public static double countPercentOfCandy(Map<Integer, Decoration> dictionary) {
        double count = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Candy) {
                count += 1;
            }
        }
        return (count / dictionary.size());
    }
    
    public static double countPercentOfFlashlight(Map<Integer, Decoration> dictionary) {
        double count = 0;
        for (Decoration decoration : dictionary.values()) {
            if (decoration instanceof Flashlight) {
                count += 1;
            }
        }
        return (count / dictionary.size());
    }
}
