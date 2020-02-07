import accessories.Accessory;
import org.junit.Before;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Piano Key", "New white key for Steinway",20.00, 40.00);
    }

}
