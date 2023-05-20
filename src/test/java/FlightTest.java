import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;

    ArrayList<CabinCrewMember> cabinCrewMembers;

    ArrayList<Passenger> passengers;

    Plane plane;

    String flightNumber;
    String flightDestination;
    String departureAirport;

    String departureTime;

    @Before
    public void before(){
        pilot = new Pilot("Tom", Rank.CAPTAIN, "PILOT391");
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(new CabinCrewMember("Sergio", Rank.PURSER));
        cabinCrewMembers.add(new CabinCrewMember("Fabio", Rank.FLIGHT_ATTENDANT));
        passengers = new ArrayList<>();
        passengers.add(new Passenger("Charlie", 2));
        plane = new Plane(PlaneType.CONCORDE);
        flightNumber = "TK321";
        flightDestination = "HND";
        departureAirport = "EDI";
        departureTime = "10:00";
        flight = new Flight(
                pilot,
                cabinCrewMembers,
                passengers,
                plane,
                flightNumber,
                flightDestination,
                departureAirport,
                departureTime);
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightHasListOfCabinCrewMembers(){
        assertEquals(cabinCrewMembers, flight.getCabinCrewMembers());
    }

    @Test
    public void flightHasListOfPassengers(){
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals(flightNumber, flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals(flightDestination, flight.getFlightDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals(departureAirport, flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals(departureTime, flight.getDepartureTime());
    }

    @Test
    public void flightHasNumberOfAvailableSeats(){
        assertEquals(199, flight.getAvailableSeats());
    }

    @Test
    public void passengerCanBeBookedOnFlightIfSeatsAvailable(){
        Passenger passenger = new Passenger("Simon", 1);
        assertEquals(true, flight.bookPassengerOnFlight(passenger));
    }




}
