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
        Object obj = null;
        TKlient instance = new TKlient();
        boolean expResult = false;
        for(int i =0; i < 8; i ++)
        {
            boolean result = instance.equals(obj);
            assertEquals(expResult, result);
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
