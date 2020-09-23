package entity;

public class ParkingLot {

    Spot[][] spots;

    public ParkingLot(int length, int width) {
        this.spots = new Spot[length][width];
    }


    public Spot[][] getSpots() {
        return spots;
    }

    public void setSpots(Spot[][] spots) {
        this.spots = spots;
    }
}
