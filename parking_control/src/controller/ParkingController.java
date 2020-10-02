package controller;

import entity.ParkingLot;

import java.io.Serializable;

public class ParkingController implements Serializable {

    ParkingLot parkingLot;

    public ParkingController(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public String[] listSpots(ParkingLot parkingLot) {
        String[] results = new String[parkingLot.getSpots().length * parkingLot.getSpots()[0].length];
        int index = 0;
        for (int i = 0; i < parkingLot.getSpots().length; i++) {
            for (int j = 0; j < parkingLot.getSpots()[i].length; j++) {
                if (parkingLot.getSpots()[i][j].isOccupied()) {
                    results[index] = "O lugar de linha: " + i + " e coluna: " + j + ", está ocupado";
                } else {
                    results[index] = "O lugar de linha: " + i + " e coluna: " + j + ", está livre";
                }
                index++;
            }

        }
        return results;
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
