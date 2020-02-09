package instruments;

public class Harpsichord extends Instrument {

    public int numOfManuals;

    public Harpsichord(String name, String colour, InstrumentType instrumentType, String sound, double buyPrice, double sellPrice, int numOfManuals) {
        super(name, colour, instrumentType, sound, buyPrice, sellPrice);
        this.numOfManuals = numOfManuals;
    }

    public int getNumOfManuals() {
        return numOfManuals;
    }
}
