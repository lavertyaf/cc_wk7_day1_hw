package ThemePark.Stalls;

import ThemePark.IChargeable;
import ThemePark.Visitor;

public class CandyFloss extends Stall implements IChargeable{

    public CandyFloss(String name, String ownerName, int parkingSpot, int price) {
        super(name, ownerName, parkingSpot, price);
    }

    public double priceFor(Visitor visitor){
        return price;
    }
}
