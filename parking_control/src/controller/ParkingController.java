package controller;

import entity.ParkingLot;

public class ParkingController {

    ParkingLot parkingLot;

    public ParkingController(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public String listSpots(ParkingLot parkingLot) {
        return parkingLot.toString();
    }

    public String allocateCar(int line, int column) {
        if (parkingLot.getSpots()[line][column].isOccupied()) {
            return "Sorry, this spot is already occupied! please choose another one. \n";
        }
        parkingLot.getSpots()[line][column].setOccupied(true);
        return "Great! This spot, line: " + line + " and column: " + column + ", is now occpupied by you! \n";

    }

    public String removeCar(int line, int column) {

        if (parkingLot.getSpots()[line][column].isOccupied()) {
            parkingLot.getSpots()[line][column].setOccupied(false);
            return "The spot " + line + column + " is now free! \n";
        }
            return "This is not a valid spot, please, select another one! \n";
    }
}
