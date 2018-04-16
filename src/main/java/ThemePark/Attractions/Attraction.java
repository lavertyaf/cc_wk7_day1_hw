package ThemePark.Attractions;

import ThemePark.IEnjoyable;

public abstract class Attraction implements IEnjoyable {

    private String name;
    int funRating;

    public Attraction(String name, int funRating) {
        this.name = name;
        this.funRating = funRating;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getFunRating() {
        return funRating;
    }
}
