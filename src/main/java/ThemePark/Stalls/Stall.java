package ThemePark.Stalls;

import ThemePark.IChargeable;

public abstract class Stall implements IChargeable {

    String name;
    String ownerName;
    int parkingSpot;
    int price;

    public Stall(String name, String ownerName, int parkingSpot, int price){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public int getPrice() {
        return price;
    }
}
