package by.bntu.fitr.povt.sunRevival.Logic;

import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;

import java.util.Map;

public class Rounder {
    
    public static double round(double element) {
        return Double.valueOf(String.format("%.2f", element));
            }
}
