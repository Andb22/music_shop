import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender Stratocaster", "Red", InstrumentType.STRING, "plang", 4000.00, 8400.00, 6);
    }


    @Test
    public void canGetName(){
        assertEquals("Fender Stratocaster", guitar.getName());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(4000.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(8400.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(110, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("plang", guitar.play());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(6, guitar.getNumOfStrings());
    }
}
