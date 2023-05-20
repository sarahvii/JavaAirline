import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Tom", Rank.CAPTAIN, "PILOT391");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Tom", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicence() {
        assertEquals("PILOT391", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() { assertEquals("I believe I can fly", pilot.canFlyPlane());}
}
