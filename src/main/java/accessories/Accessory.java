package accessories;

import behaviours.IPlay;
import behaviours.ISell;

public class Accessory implements IPlay, ISell {

    public String name;
    public String description;
    public double buyPrice;
    public double sellPrice;

    public Accessory(String name, String description, double buyPrice, double sellPrice) {
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return (sellPrice - buyPrice);
    }
}
