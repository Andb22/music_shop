package accessories;

public class PianoKey extends Accessory{

    public String colour;

    public PianoKey(String name, String description, double buyPrice, double sellPrice, String colour) {
        super(name, description, buyPrice, sellPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
