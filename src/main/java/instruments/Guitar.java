package instruments;

public class Guitar extends Instrument{

    public int numOfStrings;

    public Guitar(String name, String colour, InstrumentType instrumentType, String sound, double buyPrice, double sellPrice, int numOfStrings) {
        super(name, colour, instrumentType, sound, buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }


}
