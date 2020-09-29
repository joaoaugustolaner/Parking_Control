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
        String option = "0";
        int line, column;

        ParkingController parkingController = new ParkingController(new ParkingLot(3, 3));
        ServerSocket reception = new ServerSocket(8080);

        //connection

        Socket connection = reception.accept();
        BufferedReader fromClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        DataOutputStream toClient = new DataOutputStream(connection.getOutputStream());
//
//            //falta o menu
//
//
//            option = client.read();
        Scanner scanner = new Scanner(System.in);

        option = fromClient.readLine();

        while (!option.equals("5")) {

//            System.out.println("1 - Cadastrar Veículo\n");
//            System.out.println("2 - Remover Veículo\n");
//            System.out.println("3 - Listar vagas disponíveis\n");
//            System.out.println("4 - Listar todas as vagas\n");
//            System.out.println("5 - SAIR\n");
//
//            option = scanner.nextInt();


            switch (option) {

                case "1":
                    Runtime.getRuntime().exec("clear");
                    System.out.println("\nInforme o lugar a ser reservado: \n");
                    System.out.println("Informe a linha \n");
                    line = scanner.nextInt();
                    System.out.println("Informe a coluna \n");
                    column = scanner.nextInt();
                    parkingController.allocateCar(line, column);
                    break;

                case "2":
                    System.out.println("\nInforme o lugar que deseja que seja liberado: \n");
                    System.out.println("Informe a linha \n");
                    line = scanner.nextInt();
                    System.out.println("Informe a coluna \n");
                    column = scanner.nextInt();
                    parkingController.removeCar(line, column);
                    break;

                case "3":
                    parkingController.listAvailableSpots(parkingController.getParkingLot());
                    break;

                case "4":
                    parkingController.listAllSpots(parkingController.getParkingLot());
                    break;

                case "5":
                    System.out.println("Aplicação finalizada com sucesso");
                    option = "5";
                    break;

                default:
                    System.out.println("Escolha uma opção válida\n");
                    break;
            }
        }
    }
}


