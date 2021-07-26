import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Big Ben", 8);
        tobaccoStall = new TobaccoStall("Black Lungs", "Jimbo Baggins", ParkingSpot.A1, 1);
        visitor = new Visitor(18, 200, 20);
    }

    @Test
    public void checkListOfReviewedAttraction() {
        themePark.addReview(rollerCoaster);
        themePark.addReview(tobaccoStall);
        assertEquals(2, themePark.getReviewed().size());
    }

    @Test
    public void addVisistorAndIncreaseCount() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions().size());
    }

}
