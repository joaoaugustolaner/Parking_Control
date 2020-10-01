import controller.ParkingController;
import entity.ParkingLot;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        int option = 0;
        int line, column;

        ParkingController parkingController = new ParkingController(new ParkingLot(3, 3));
        ServerSocket reception = new ServerSocket(8080);

        //connection

        Socket connection = reception.accept();
        ObjectOutputStream outputStream = new ObjectOutputStream(connection.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(connection.getInputStream());


        while (option != 4) {

            option = (int) inputStream.readObject();
            String result;
            switch (option) {

                case 1:

                    line = (int) inputStream.readObject();
                    column = (int) inputStream.readObject();
                    result = (parkingController.allocateCar(line, column));
                    outputStream.writeObject(result);
                    break;

                case 2:
                    line = (int) inputStream.readObject();
                    column = (int) inputStream.readObject();
                    result = parkingController.removeCar(line, column);
                    outputStream.writeObject(result);
                    break;

                case 3:
                    result = parkingController.listSpots(parkingController.getParkingLot());
                    outputStream.writeObject(result);
                    break;

                case 4:
                    option = 4;
                    break;

                default:
                    break;
            }
        }

        System.out.println("Quited by user! ");
        connection.close();
    }
}


