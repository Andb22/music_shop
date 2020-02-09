package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double calculateMarkup() {
        return ((this.sellPrice - this.buyPrice)/this.buyPrice)*100;
    }

}
