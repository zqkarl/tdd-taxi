package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TaxiTest {
    @Test
    public void testDistanceLessThan2(){
        Taxi taxi = new Taxi(1,0);
        assertEquals(6,taxi.getPrice());
    }
    @Test
    public void testDistanceBetween2And8(){
        Taxi taxi = new Taxi(3,0);
        assertEquals(7,taxi.getPrice());
    }
    @Test
    public void testDistanceOver8(){
        Taxi taxi = new Taxi(10,0);
        assertEquals(13,taxi.getPrice());
    }
    @Test
    public void testWait(){
        Taxi taxi = new Taxi(2,3);
        assertEquals(7,taxi.getPrice());
    }
    @Test
    public void testGetReceipt(){
        Taxi taxi = new Taxi(2,3);
        assertEquals("收费7元",taxi.getReceipt());
    }
    
    @Test
    public void testTaix(){
        Taxi taxi = new Taxi(2,3);
        assertNotNull(taxi);
    }
}
