package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String colour;
    private InstrumentType instrumentType;
    private String sound;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String name, String colour, InstrumentType instrumentType, String sound, double buyPrice, double sellPrice) {
        this.name = name;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkup() {
        return ((this.sellPrice - this.buyPrice)/this.buyPrice)*100;
    }

    public String play(){
        return this.sound;
    }
}
