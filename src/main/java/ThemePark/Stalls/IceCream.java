package ThemePark.Stalls;

import ThemePark.IChargeable;
import ThemePark.Visitor;

public class IceCream extends Stall implements IChargeable{

    public IceCream(String name, String ownerName, int parkingSpot, int price) {
        super(name, ownerName, parkingSpot, price);
    }

    public double priceFor(Visitor visitor){
        return price;
    }
}
