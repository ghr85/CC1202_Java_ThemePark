package Stalls;

public abstract class Stall  {
    protected String name;
    protected String ownerName;
    protected String parkingSpot;

public Stall(String name, String ownerName, String parkingSpot){
    this.name = name;
    this.ownerName = ownerName;
    this.parkingSpot = parkingSpot;
}

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getParkingSpot() {
        return this.parkingSpot;
    }
}
