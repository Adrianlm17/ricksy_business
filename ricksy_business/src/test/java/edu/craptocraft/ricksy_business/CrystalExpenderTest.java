package edu.craptocraft.ricksy_business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CrystalExpenderTest {
    
    private CrystalExpender expender = null;

    @Before
    public void checkWelcomPack(){
        expender = new CrystalExpender(3, 50);
        assertNotNull("Creado", expender);
    }

    @Test
    public void checkStock(){
        CreditCard card = new CreditCard("Abradolph Lincler", "4916119711304546");
        expender.dispatch(card);
        assertEquals(2, expender.stock());
    }
}
