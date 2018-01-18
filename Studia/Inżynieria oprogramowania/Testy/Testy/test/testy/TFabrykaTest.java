package testy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mypackage.TFabryka;
import mypackage.TKlient;
import mypackage.TProdukt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

/**
 *
 * @author mateu
 */
//@Category({Test_control.class, Test_Entity.class})
public class TFabrykaTest {
    Dane dane;
    
    public TFabrykaTest() {
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void setUp() {
        dane = new Dane();
    }

    /**
     * Test of nowyProdukt method, of class TFabryka.
     */
    @Test
    public void testNowyProdukt() {
        System.out.println("nowyProdukt");
        Object[] data = null;
        TFabryka instance = new TFabryka();
       // TProdukt expResult = null;
       for(int i = 0; i < 7; i++)
       {
        TProdukt result = instance.nowyProdukt(dane.dane_produktow[i]);
        assertEquals(dane.produkty()[i], result);
       }
       exception.expect(ClassCastException.class);
       exception.expectMessage("");
       instance.nowyProdukt(dane.dane_produktow[7]);
    }

    /**
     * Test of nowyKlient method, of class TFabryka.
     */
    @Test
    public void testNowyKlient() throws Exception{
        System.out.println("nowyKlient");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        //TKlient expResult = null;
        for(int i=0; i <7; i++)
        {
            TKlient result = instance.nowyKlient(dane.dane_klientow[i]);
            assertEquals(dane.klienci()[i], result);
        }
        exception.expect(java.lang.Exception.class);
        exception.expectMessage("Podano niewłaściwy pesel");
        instance.nowyKlient(dane.dane_klientow[7]);
    }
}
