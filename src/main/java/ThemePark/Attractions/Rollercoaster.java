package ThemePark.Attractions;

import ThemePark.IChargeable;
import ThemePark.IRestrictable;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements IChargeable, IRestrictable{

    private String name;
    private int price;

    public Rollercoaster (String name, int funRating, int price){
        super(name, funRating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean isTallEnough = visitor.getHeight() > 145;
        boolean isOldEnough = visitor.getAge() >= 12;
            return isOldEnough && isTallEnough;
        }

    public double priceFor(Visitor visitor){
        return price;
    }
}
