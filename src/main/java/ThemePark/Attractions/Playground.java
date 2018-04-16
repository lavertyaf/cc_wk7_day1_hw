package ThemePark.Attractions;

import ThemePark.IRestrictable;
import ThemePark.Visitor;

public class Playground extends Attraction implements IRestrictable{

    private String name;
    private int funRating;


    public Playground(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        Boolean isYoungEnough = visitor.getAge() <= 15;
            return isYoungEnough;

    }
}
