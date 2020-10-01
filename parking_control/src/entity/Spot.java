package entity;

import java.io.Serializable;

public class Spot implements Serializable {

    private Car car;
    private boolean isOccupied;

    public Spot() {
        this.isOccupied = false;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
