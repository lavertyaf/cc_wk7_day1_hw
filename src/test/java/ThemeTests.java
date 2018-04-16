import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Park;
import ThemePark.Attractions.Playground;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.Stalls.CandyFloss;
import ThemePark.Stalls.IceCream;
import ThemePark.Stalls.Tobacco;
import ThemePark.Visitor;
import ThemePark.
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParksTests {

    Dodgems dodgems;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;
    CandyFloss candyFloss;
    IceCream iceCream;
    Tobacco tobacco;
    Visitor oldPoorVisitor;
    Visitor oldRichVisitor;
    Visitor youngPoorShortVisitor;
    Visitor youngPoorTallVisitor;
    Visitor youngRichShortVisitor;
    Visitor youngRichTallVisitor;




    @Before
    public void before(){
        dodgems = new Dodgems("Davys Dodgy Dodgems", 5, 5);
        park = new Park ("Parakeet Park", 1);
        playground = new Playground("Petey the Pirates Playground", 3);
        rollercoaster = new Rollercoaster("Roland's Rolley Rollercaster - of love", 5, 7);
        candyFloss = new CandyFloss("Sweet stuff", "Floss", 36, 5);
        iceCream = new IceCream("Creamiest Cream", "Maggie", 24, 3);
        tobacco = new Tobacco("Tommy's Tobacco", "Tommy", 12, 15);
        oldPoorVisitor = new Visitor("Jimmy", 35, 175.00, 5);
        oldRichVisitor = new Visitor("Bernie", 40, 184.00, 25);
        youngPoorShortVisitor = new Visitor("Stevie", 10, 100.00, 5);
        youngPoorTallVisitor = new Visitor("Dale", 11, 150.00, 5);
        youngRichShortVisitor = new Visitor("Andy", 9, 110.00, 25);
        youngRichTallVisitor = new Visitor("Rodney", 10, 145.00, 25);
    }

    @Test
    public void canGetAge(){
        assertEquals(10, youngRichTallVisitor.getAge());
    }


}
