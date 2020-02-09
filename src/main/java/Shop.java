import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(int index){
        this.stock.remove(index);
    }

    public double TotalPotentialProfit(){
        double total = 0;
        for(ISell item: this.stock){
            total += (item.getBuyPrice() * (item.calculateMarkup()/100));
        }
        return total;
    }


}
