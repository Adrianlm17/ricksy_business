package edu.craptocraft.ricksy_business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;

public class CreditCardTest {
    
    private CreditCard card = null;

    @Before
    public void checkNewCard(){
        card = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertNotNull("Card creada!", card);
    }

}
