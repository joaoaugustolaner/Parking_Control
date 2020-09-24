package controller;

import entity.ParkingLot;

public class ParkingController {

    ParkingLot parkingLot = new ParkingLot(100, 100);

    public void listAvailableSpots(ParkingLot parkingLot) {
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                if(!parkingLot.getSpots()[i][j].isOccupied()) {
                    System.out.println("These spots are current available");
                    System.out.print(parkingLot.getSpots()[i][j].isOccupied() + "\t");
                }
            }
            System.out.println("\n");
        }
    }

    public void listAllSpots(ParkingLot parkingLot) {
        System.out.println("These are all spots available in the parking lot\n");
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                System.out.print(parkingLot.getSpots()[i][j].isOccupied() + "\t");
            }
            System.out.println("\n");
        }
    }

    public void allocateCar(int line, int column) {
        if(parkingLot.getSpots()[line][column].isOccupied()) {
            System.out.println("Sorry, this spot is already occupied! please choose another one.");
        } else {
            parkingLot.getSpots()[line][column].setOccupied(true);
            System.out.println("Great! This spot " + line + " " + column + " is now occpupied by you!");
        }
    }

    public void removeCar(int line, int column) {
        if(!parkingLot.getSpots()[line][column].isOccupied()){
            System.out.println("This spot is now free!");
        } else {
            System.out.println("This is not a vallid spot, please, select another one!");
        }
    }
}
