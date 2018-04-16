package ThemePark.Stalls;

import ThemePark.IChargeable;
import ThemePark.IRestrictable;
import ThemePark.Visitor;

public class Tobacco extends Stall implements IRestrictable, IChargeable{

    public Tobacco(String name, String ownerName, int parkingSpot, int price) {
        super(name, ownerName, parkingSpot, price);
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge()>18);
        return priceFor(visitor);
    }

    public boolean isAllowedTo(Visitor visitor){
        Boolean isOldEnough = visitor.getAge()>= 18;
        return isOldEnough;
    }
}
