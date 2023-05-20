import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {cabinCrewMember = new CabinCrewMember("Sergio", Rank.PURSER);}

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Sergio", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank() {
        assertEquals(Rank.PURSER, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberCanSpeakToPassengers() {
        assertEquals("Brace!", cabinCrewMember.speakToPassengers());
    }



}
