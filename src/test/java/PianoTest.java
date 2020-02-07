import instruments.Instrument;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Steinway", "Black", InstrumentType.KEYBOARD, "plink", 1000.00, 2400.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Steinway", piano.getName());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1000.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(2400.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(140, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("plink", piano.play());
    }
}
