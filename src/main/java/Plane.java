public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getType() {
        return planeType;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public double getTotalWeight() {
        return planeType.getTotalWeight();
    }
}
