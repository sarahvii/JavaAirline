public enum PlaneType {
    BOEING747(747, 1000),
    CONCORDE(200, 2000),
    SPACE_ROCKET(20, 3000);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
