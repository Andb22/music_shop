import instruments.Harpsichord;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Harpsichord harpsichord;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano("Steinway", "Black", InstrumentType.KEYBOARD, "plink", 1000.00, 2400.00, PianoType.GRAND);
        harpsichord = new Harpsichord("Harpie", "Mahogany", InstrumentType.KEYBOARD, "twang", 2500.00, 5000.00, 2);
    }

    @Test
    public void canAddItemToList(){
        shop.addItem(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromList(){
        shop.addItem(piano);
        shop.removeItem(0);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canReturnTotalShopProfit(){
        shop.addItem(piano);
        shop.addItem(harpsichord);
        shop.addItem(piano);
        assertEquals(5300.00, shop.TotalPotentialProfit(), 0.01);
    }
}
