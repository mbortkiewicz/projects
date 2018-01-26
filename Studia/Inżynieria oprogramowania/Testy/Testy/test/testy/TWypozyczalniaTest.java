/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import mypackage.TFaktura;
import mypackage.TKlient;
import mypackage.TProdukt;
import mypackage.TWypozyczalnia;
import mypackage.TWypozyczenie;
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
public class TWypozyczalniaTest {
    
    TWypozyczalnia instance;
    Dane dane;
    
    public TWypozyczalniaTest() {
    }
    
    @Parameterized.Parameter
    public int pos1;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{0},{1},{2},{3},{4},{5}};
        return Arrays.asList(data1);
    }
    
    @Before
    public void setUp() throws ParseException {
        instance = new TWypozyczalnia();
        dane = new Dane();
        
        instance.wypozyczenia = new LinkedList<TWypozyczenie>(Arrays.asList(dane.wypozyczenia()));
        
        for (int i=0; i < 6; i++)
        {
            instance.magazyn.dodaj_TProdukt(dane.dane_produktow[i]);
            instance.kartoteka.dodaj_TKlienta(dane.klienci()[i]);
        }  
    }
    
    /**
     * Test of wypozyczenie method, of class TWypozyczalnia.
     * @throws java.lang.Exception
     */
    @Test
    public void testWypozyczenie() throws Exception {
        System.out.println("wypozyczenie");
        TKlient klient = dane.klienci()[pos1];
        TProdukt[] produkty = new TProdukt[]{dane.produkty()[pos1]};
        int ilosc_dni = 7;
        boolean expResult = true;
        boolean result = instance.wypozyczenie(klient, produkty, ilosc_dni);
        assertEquals(expResult, result);
    }

    /**
     * Test of zwrot method, of class TWypozyczalnia.
     */
    @Test
    public void testZwrot() throws Exception{
        System.out.println("zwrot");
        TKlient klient = dane.klienci()[pos1];
        TProdukt[] produkty = new TProdukt[]{dane.produkty()[pos1]};
        boolean expResult = true;
        boolean result = instance.zwrot(klient, produkty);
        assertEquals(expResult, result);
    }   
}
