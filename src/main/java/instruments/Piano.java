package instruments;

public class Piano extends Instrument{

    public PianoType pianoType;

    public Piano(String name, String colour, InstrumentType instrumentType, String sound, double buyPrice, double sellPrice, PianoType pianoType) {
        super(name, colour, instrumentType, sound, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}
