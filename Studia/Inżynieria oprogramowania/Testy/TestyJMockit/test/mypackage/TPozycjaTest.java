/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import mockit.Capturing;
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
public class TPozycjaTest {

    TFabryka fabryka = new TFabryka();
    
    @Capturing(maxInstances = 1)
    TProdukt produkt1;
    
    @Test
    public void test_get_stawka() {
        new Expectations(){
            {
                produkt1.getStawka();
                result = 3.3F;
            }
        };
        
        TProdukt produkt11 = fabryka.nowyProdukt(new Object[]{new TTytul(), 1, 3.3F, true, TProdukt.Nosnik.DVD}); 
        assertEquals(3.3F, produkt11.getStawka(), 0F);
        
        TPozycja pozycja1 = fabryka.nowaPozycja(new Object[]{produkt11, produkt11.getStawka(), false});
        assertEquals(pozycja1.getStawka(), 3.3F, 0F);         
    }   
}
