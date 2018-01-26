/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

import java.util.Arrays;
import java.util.Collection;
import static jdk.nashorn.internal.objects.NativeMath.round;
import mypackage.TKalkulator;
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
 * @author mateu
 */
@RunWith(Parameterized.class)
public class TKalkulatorTest {
    
    Dane dane;
    public TKalkulatorTest() {
    }
    
    @Before
    public void setUp() {
        dane = new Dane();
    }
    @Parameterized.Parameter
    public int pos1;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{0},{1},{2},{3},{4},{5}};
        return Arrays.asList(data1);
    }

    /**
     * Test of oblicz_stawke method, of class TKalkulator.
     */
    @Test
    public void testOblicz_stawke() {
        System.out.println("oblicz_stawke");
        TKalkulator instance = new TKalkulator();
        float expResult = (float)round(dane.ceny[pos1],1);
        float result = (float)round(instance.oblicz_stawke(7, (float)dane.dane_produktow[pos1][2]),1);
        assertEquals(expResult, result, 0.0f);
    }    
}
