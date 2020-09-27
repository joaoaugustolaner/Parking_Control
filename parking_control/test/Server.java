import controller.ParkingController;
import entity.ParkingLot;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception {
        int option = 0;

        ServerSocket reception = new ServerSocket(8080);

        //connection

//            Socket connection = reception.accept();
//            BufferedReader client = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            DataOutputStream server = new DataOutputStream(connection.getOutputStream());
//
//            //falta o menu
//
//
//            option = client.read();
        Scanner scanner = new Scanner(System.in);


        while (option != 5) {

            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Remover Veículo");
            System.out.println("3 - Listar vagas disponíveis");
            System.out.println("4 - Listar todas as vagas");
            System.out.println("5 - SAIR");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("tá entrei");
                    break;
                case 2:
                    System.out.println("aham, us guri");
                    break;
                case 3:
                    System.out.println("lista disponível");
                    break;
                case 4:
                    System.out.println("lista tudo");
                    break;
                case 5:
                    System.out.println("LET ME OUTTTT");
                    option = 5;
                default:
                    break;
            }


        }
    }
}


