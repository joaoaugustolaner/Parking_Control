package controller;

import entity.ParkingLot;

public class ParkingController {

    ParkingLot parkingLot = new ParkingLot(100, 100);

    public void listAvailableSpots(ParkingLot parkingLot) {
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                System.out.println(parkingLot.getSpots()[i][j]);
            }
        }
    }

    public void listAllSpots() {

    }

    public void allocateCar(int line, int column) {

    }

    public void removeCar() {

    }
}
