import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private ArrayList<Passenger> passengers;

    private Plane plane;

    private String flightNumber;

    private String flightDestination;

    private String departureAirport;

    private String departureTime;

    public Flight(
            Pilot pilot,
            ArrayList<CabinCrewMember> cabinCrewMembers,
            ArrayList<Passenger> passengers,
            Plane plane,
            String flightNumber,
            String flightDestination,
            String departureAirport,
            String departureTime
    ){
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.flightDestination = flightDestination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public boolean bookPassengerOnFlight(Passenger passenger) {
        if (passengers.size() < plane.getCapacity()) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }
}
