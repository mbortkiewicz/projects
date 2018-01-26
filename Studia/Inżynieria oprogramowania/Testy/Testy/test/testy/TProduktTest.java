/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

import mypackage.TProdukt;
import mypackage.TTytul;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mateu
 */
public class TProduktTest {
    
    Dane dane;
    public TProduktTest() {
    }
    
    @Before
    public void setUp() {
        dane = new Dane();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class TProdukt.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        for(int i=0; i < 6; i++)
        {
            TProdukt instance = dane.produkty()[0];
            boolean expResult = true;
            boolean result = instance.equals(dane.produkty()[6]);
            assertEquals(expResult, result);
        }
    }

}
