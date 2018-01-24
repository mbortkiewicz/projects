/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

import mypackage.TKlient;
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
public class TKlientTest {
    
    Dane dane;
    public TKlientTest() {
    }
    
    @Before
    public void setUp() {
        dane = new Dane();
    }

    /**
     * Test of equals method, of class TKlient.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        TKlient instance = dane.klienci()[0];
        for(int i =0; i < 8; i ++)
        {
            boolean result = instance.equals(dane.klienci()[i]);
            if(i == 0)
                assertEquals(true, result);
            else
                assertEquals(false, result);
        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }    
}
