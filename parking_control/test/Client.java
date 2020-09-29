import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        String option = "0";

        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        Socket socketClient = new Socket("127.0.0.1", 8080);
        DataOutputStream toServer = new DataOutputStream(socketClient.getOutputStream());
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

//        Scanner scanner = new Scanner(System.in);



        while (!option.equals("5")) {

            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Remover Veículo");
            System.out.println("3 - Listar vagas disponíveis");
            System.out.println("4 - Listar todas as vagas");
            System.out.println("5 - SAIR");

            option = user.readLine();
//            option = scanner.nextLine();
            toServer.writeBytes(option + "\n");
            int optionServer = fromServer.read();
            System.out.println("From server " + optionServer);

        }
        socketClient.close();
    }
}
