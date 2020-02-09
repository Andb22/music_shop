import accessories.PianoKey;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoKeyTest {

    PianoKey pianoKey;

    @Before
    public void before(){
        pianoKey = new PianoKey("Piano Key", "New white key for Steinway",20.00, 40.00, "White");
    }

    @Test
    public void canGetName(){
        assertEquals("Piano Key", pianoKey.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("New white key for Steinway", pianoKey.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(20.00, pianoKey.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(40.00, pianoKey.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("White", pianoKey.getColour());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, pianoKey.calculateMarkup(), 0.01);
    }
}
