import controller.ParkingController;
import entity.ParkingLot;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        int option;

        ServerSocket reception = new ServerSocket(8080);

        while(true) {

            //connection

            Socket connection = reception.accept();
            BufferedReader client = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            DataOutputStream server = new DataOutputStream(connection.getOutputStream());

            //falta o menu


            option = client.read();


        }
    }
}
