import instruments.Instrument;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Piano", "Black", InstrumentType.KEYBOARD, "plink", 1000.00, 2400.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Piano", instrument.getName());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, instrument.getInstrumentType());
    }

    @Test
    public void canGetSound() {
        assertEquals("plink", instrument.getSound());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1000.00, instrument.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(2400.00, instrument.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", instrument.getColour());
    }
}
