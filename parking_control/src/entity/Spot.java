package entity;

public class Spot {

    private boolean isOccupied;

    public Spot() {
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
