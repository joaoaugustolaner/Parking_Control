package controller;

import entity.ParkingLot;

public class ParkingController {

    ParkingLot parkingLot;

    public ParkingController(ParkingLot parkingLot) {
        this.parkingLot =  parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void listAvailableSpots(ParkingLot parkingLot) {
        System.out.println("These spots are current available: \n");
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                if(!parkingLot.getSpots()[i][j].isOccupied()) {
                    System.out.print(parkingLot.getSpots()[i][j].isOccupied() + "\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void listAllSpots(ParkingLot parkingLot) {
        System.out.println("These are all spots available in the parking lot: \n");
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                System.out.print(parkingLot.getSpots()[i][j].isOccupied() + "\t");
            }
            System.out.println("\n");
        }
    }

    public void allocateCar(int line, int column) {
        if(parkingLot.getSpots()[line][column].isOccupied()) {
            System.out.println("Sorry, this spot is already occupied! please choose another one. \n");
        } else {
            parkingLot.getSpots()[line][column].setOccupied(true);
            System.out.println("Great! This spot " + line  + column + " is now occpupied by you! \n");
        }
    }

    public void removeCar(int line, int column) throws IllegalArgumentException{

        if(parkingLot.getSpots()[line][column].isOccupied()){
            parkingLot.getSpots()[line][column].setOccupied(false);
            System.out.println("The spot " + line + column + " is now free! \n");
        } else {
            System.out.println("This is not a valid spot, please, select another one! \n");
        }
    }
}
