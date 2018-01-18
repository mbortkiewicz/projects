/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TFabrykaTest {
    
    public TFabrykaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nowyTytul method, of class TFabryka.
     */
  
    public void testNowyTytul() {
        System.out.println("nowyTytul");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TTytul expResult = null;
        TTytul result = instance.nowyTytul(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nowyProdukt method, of class TFabryka.
     */
    @org.junit.Test
    public void testNowyProdukt() {
        System.out.println("nowyProdukt");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TProdukt expResult = null;
        TProdukt result = instance.nowyProdukt(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nowyKlient method, of class TFabryka.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testNowyKlient() throws Exception {
        System.out.println("nowyKlient");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TKlient expResult = null;
        TKlient result = instance.nowyKlient(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nowaFaktura method, of class TFabryka.
     */
 
    public void testNowaFaktura() {
        System.out.println("nowaFaktura");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TFaktura expResult = null;
        TFaktura result = instance.nowaFaktura(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of noweWypozyczenie method, of class TFabryka.
     */
   
    public void testNoweWypozyczenie() {
        System.out.println("noweWypozyczenie");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TWypozyczenie expResult = null;
        TWypozyczenie result = instance.noweWypozyczenie(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nowaPozycja method, of class TFabryka.
     */
 
    public void testNowaPozycja() {
        System.out.println("nowaPozycja");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TPozycja expResult = null;
        TPozycja result = instance.nowaPozycja(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nowePotwierdzenie method, of class TFabryka.
     */

    public void testNowePotwierdzenie() {
        System.out.println("nowePotwierdzenie");
        Object[] data = null;
        TFabryka instance = new TFabryka();
        TPotwierdzenie expResult = null;
        TPotwierdzenie result = instance.nowePotwierdzenie(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
