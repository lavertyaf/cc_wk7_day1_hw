package ThemePark.Attractions;

import ThemePark.IChargeable;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements IChargeable{

    private String name;
    private int price;

    public Dodgems(String name, int funRating, int price){
        super(name, funRating);
        this.price = price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12);
            return (priceFor(visitor) * 0.5);
//            return price;

    }

}
