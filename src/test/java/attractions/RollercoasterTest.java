package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(15, 150, 20);
        visitor1 = new Visitor(15, 220, 5);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeVisitor() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void willNotChargeVisitor() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }
}
