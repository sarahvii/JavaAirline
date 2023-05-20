import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(747, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight() {
        assertEquals(1000, plane.getTotalWeight(), 0.1);
    }

}
