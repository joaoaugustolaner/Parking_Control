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
        System.out.println("These are all spots available in the parking lot: \n");
//        for (int i = 0; i < parkingLot.getSpots().length; i++) {
//            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
//                System.out.print(parkingLot.getSpots()[i][j].isOccupied() + "\t");
//            }
//            System.out.println("\n");

        return parkingLot.toString();
    }

    public String allocateCar(int line, int column) {
        if (parkingLot.getSpots()[line][column].isOccupied()) {
            return "Sorry, this spot is already occupied! please choose another one. \n";
        }
        parkingLot.getSpots()[line][column].setOccupied(true);
        return "Great! This spot, line: " + line + "  /  column: " + column + ", is now occpupied by you! \n";

    }

    public String removeCar(int line, int column) {

        if (parkingLot.getSpots()[line][column].isOccupied()) {
            parkingLot.getSpots()[line][column].setOccupied(false);
            return "The spot " + line + column + " is now free! \n";
        }
            return "This is not a valid spot, please, select another one! \n";
    }
}
