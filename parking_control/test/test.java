import controller.ParkingController;
import entity.ParkingLot;

public class test {

    public static void main(String[] args) {


        //declarations
        ParkingController parkingController = new ParkingController();
        ParkingLot parkingLot = new ParkingLot(5, 5);


        parkingController.listAllSpots(parkingLot);
    }
}
