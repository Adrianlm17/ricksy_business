package edu.craptocraft.ricksy_business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class UfosParkTest {
    
    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    @Before
    public void setupUfosPark() {
        ufos = new UfosPark();
        assertNotNull("Parque de UFOS creados", ufos);
        for (String ovni : ovnis) {
			ufos.add(ovni);
        }
    }

    @Test
    public void getUfoOfTest() {
        CreditCard card = new CreditCard("Abradolf Lincler", "4916119711304546");
        ufos.dispatch(card);
        assertTrue(ufos.toString().contains(ufos.getUfoOf(card.number())));
        assertEquals(2500, card.credit(), 0);
    }

    @Test
    public void dispatchTest() {
        CreditCard card = new CreditCard("Abradolf Lincler", "4916119711304546");
        ufos.dispatch(card);
        assertTrue(ufos.containsCard(card.number()));
        List<String> cards = ufos.cardNumbers()
                                    .stream()
                                    .filter(n -> n == card.number())
                                    .collect(Collectors.toList());

        assertEquals(1, cards.size(), 0);
        assertEquals(2500, card.credit(), 0);
    }
    
}
