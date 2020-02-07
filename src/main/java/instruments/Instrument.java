package instruments;

public class Instrument {

    public String name;
    public String colour;
    public InstrumentType instrumentType;
    public String sound;
    public double buyPrice;
    public double sellPrice;

    public Instrument(String name, String colour, InstrumentType instrumentType, String sound, double buyPrice, double sellPrice) {
        this.name = name;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getSound() {
        return sound;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
