/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 *
 * @author mateu
 */
@RunWith(JMockit.class)
public class TProduktTest {
    
    public TProduktTest() {
    }  

    /**
     * Test of hashCode method, of class TProdukt.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TProdukt instance = new TProdukt();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TProdukt.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TProdukt instance = new TProdukt();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class TProdukt.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        TProdukt instance = new TProdukt();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWypozyczony method, of class TProdukt.
     */
    @Test
    public void testIsWypozyczony() {
        System.out.println("isWypozyczony");
        TProdukt instance = new TProdukt();
        boolean expResult = false;
        boolean result = instance.isWypozyczony();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWypozyczony method, of class TProdukt.
     */
    @Test
    public void testSetWypozyczony() {
        System.out.println("setWypozyczony");
        boolean wypozyczony = false;
        TProdukt instance = new TProdukt();
        instance.setWypozyczony(wypozyczony);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTytul method, of class TProdukt.
     */
    @Test
    public void testGetTytul() {
        System.out.println("getTytul");
        TProdukt instance = new TProdukt();
        TTytul expResult = null;
        TTytul result = instance.getTytul();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTytul method, of class TProdukt.
     */
    @Test
    public void testSetTytul() {
        System.out.println("setTytul");
        TTytul tytul = null;
        TProdukt instance = new TProdukt();
        instance.setTytul(tytul);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRef method, of class TProdukt.
     */
    @Test
    public void testGetRef() {
        System.out.println("getRef");
        TProdukt instance = new TProdukt();
        int expResult = 0;
        int result = instance.getRef();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRef method, of class TProdukt.
     */
    @Test
    public void testSetRef() {
        System.out.println("setRef");
        int ref = 0;
        TProdukt instance = new TProdukt();
        instance.setRef(ref);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStawka method, of class TProdukt.
     */
    @Test
    public void testGetStawka() {
        System.out.println("getStawka");
        TProdukt instance = new TProdukt();
        float expResult = 0.0F;
        float result = instance.getStawka();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStawka method, of class TProdukt.
     */
    @Test
    public void testSetStawka() {
        System.out.println("setStawka");
        float stawka = 0.0F;
        TProdukt instance = new TProdukt();
        instance.setStawka(stawka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAktywny method, of class TProdukt.
     */
    @Test
    public void testIsAktywny() {
        System.out.println("isAktywny");
        TProdukt instance = new TProdukt();
        boolean expResult = false;
        boolean result = instance.isAktywny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktywny method, of class TProdukt.
     */
    @Test
    public void testSetAktywny() {
        System.out.println("setAktywny");
        boolean aktywny = false;
        TProdukt instance = new TProdukt();
        instance.setAktywny(aktywny);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNosnik method, of class TProdukt.
     */
    @Test
    public void testGetNosnik() {
        System.out.println("getNosnik");
        TProdukt instance = new TProdukt();
        TProdukt.Nosnik expResult = null;
        TProdukt.Nosnik result = instance.getNosnik();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNosnik method, of class TProdukt.
     */
    @Test
    public void testSetNosnik() {
        System.out.println("setNosnik");
        TProdukt.Nosnik nosnik = null;
        TProdukt instance = new TProdukt();
        instance.setNosnik(nosnik);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWypozyczony method, of class TProdukt.
     */
    @Test
    public void testGetWypozyczony() {
        System.out.println("getWypozyczony");
        TProdukt instance = new TProdukt();
        boolean expResult = false;
        boolean result = instance.getWypozyczony();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktywny method, of class TProdukt.
     */
    @Test
    public void testGetAktywny() {
        System.out.println("getAktywny");
        TProdukt instance = new TProdukt();
        boolean expResult = false;
        boolean result = instance.getAktywny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
