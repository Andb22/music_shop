import instruments.Harpsichord;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpsichordTest {

    Harpsichord harpsichord;

    @Before
    public void before(){
        harpsichord = new Harpsichord("Harpie", "Mahogany", InstrumentType.KEYBOARD, "twang", 2500.00, 5000.00, 2);

    }


    @Test
    public void canGetName(){
        assertEquals("Harpie", harpsichord.getName());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, harpsichord.getInstrumentType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(2500.00, harpsichord.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(5000.00, harpsichord.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Mahogany", harpsichord.getColour());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, harpsichord.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("twang", harpsichord.play());
    }


    @Test
    public void canGetNumOfManuals(){
        assertEquals(2, harpsichord.getNumOfManuals());
    }

}
