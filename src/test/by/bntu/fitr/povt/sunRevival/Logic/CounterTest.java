package by.bntu.fitr.povt.sunRevival.Logic;

import by.bntu.fitr.povt.sunRevival.Logic.entity.Ball;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Candy;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Decoration;
import by.bntu.fitr.povt.sunRevival.Logic.entity.Flashlight;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    private static Map<Integer, Decoration> dictionary = new HashMap<Integer, Decoration>();
    
    {
        dictionary.put(1, new Ball("Ball1", "red", 3, 6));
        dictionary.put(2, new Ball("Ball3", "blue", 8, 2));
        dictionary.put(3, new Candy("Candy1", "red", 9, 6));
        dictionary.put(4, new Candy("Candy2", "green", 2, 9));
        dictionary.put(5, new Candy("Candy2", "red", 2, 9));
        dictionary.put(6, new Flashlight("Flashlight1", "red", 9, 8));
    }
    
    @Test
    public void countPriceOfTree() throws Exception {
        assertEquals(Counter.countPriceOfTree(dictionary), 33, 3);
    }
    
    @Test
    public void countPriceOfBall() throws Exception {
        assertEquals(Counter.countPriceOfBall(dictionary), 11, 2);
    }
    
    @Test
    public void countPriceOfCandy() throws Exception {
        assertEquals(Counter.countPriceOfCandy(dictionary), 13, 2);
    }
    
    @Test
    public void countPriceOfFlashLight() throws Exception {
        assertEquals(Counter.countPriceOfFlashLight(dictionary), 9, 2);
    }
    
    @Test
    public void countPercentOfBall() throws Exception {
        assertEquals(Counter.countPercentOfBall(dictionary), 0.33, 2);
    }
    
    @Test
    public void countPercentOfCandy() throws Exception {
        assertEquals(Counter.countPercentOfCandy(dictionary), 0.5, 2);
    }
    
    @Test
    public void countPercentOfFlashlight() throws Exception {
        assertEquals(Counter.countPercentOfFlashlight(dictionary), 0.17, 2);
    }
    
}