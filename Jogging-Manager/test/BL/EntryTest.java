/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.time.LocalDate;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Christoph
 */
@RunWith(value=Parameterized.class)
public class EntryTest {
    @Parameterized.Parameter(value = 0)
    public int distance;
   
    @Parameterized.Parameter(value = 1)
    public int weight;
    
    @Parameterized.Parameter(value = 2)
    public double expectedCalories;
    
     @Parameterized.Parameters(name = "")
    public static Iterable<Object[]>data1(){
        return Arrays.asList(new Object[][]{
            {13,70,819.0},
            {12,50,540.0},
            {4,80,288.0},
            {2,100,180.0}
        });
    }

    /**
     * Test of getDate method, of class Entry.
     */
    
    @Test
    public void testCalcCalories() {
        System.out.println("calcCalories");
        int kg = weight;
        Entry instance = new Entry(LocalDate.now(),distance,"test");
        instance.calcCalories(kg);
        double result = instance.getCalories();
        assertEquals(expectedCalories, result, 0.0);
        
    }

    
    
}
