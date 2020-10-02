import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        int option = 0;


        Socket socketClient = new Socket("127.0.0.1", 8080);

        ObjectOutputStream outputStream = new ObjectOutputStream(socketClient.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socketClient.getInputStream());

        Scanner scanner = new Scanner(System.in);

        while (option != 4) {
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Remover Veículo");
            System.out.println("3 - Listar vagas");
            System.out.println("4 - SAIR");

            option = scanner.nextInt();
            outputStream.writeObject(option);

            switch (option) {

                case 1:

                    System.out.println("\nInforme o lugar a ser reservado: \n");
                    System.out.println("Informe a linha \n");
                    outputStream.writeObject(scanner.nextInt());
                    System.out.println("Informe a coluna \n");
                    outputStream.writeObject(scanner.nextInt());
                    String received = (String) inputStream.readObject();
                    System.out.println(received);
                    break;

                case 2:
                    System.out.println("\nInforme o lugar que deseja que seja liberado: \n");
                    System.out.println("Informe a linha \n");
                    outputStream.writeObject(scanner.nextInt());
                    System.out.println("Informe a coluna \n");
                    outputStream.writeObject(scanner.nextInt());
                    received = (String) inputStream.readObject();
                    System.out.println(received);
                    break;

                case 3:
                    System.out.println("As vagas são: ");
                    String[] results = (String[]) inputStream.readObject();
                    for (int i = 0; i < results.length; i++) {
                        System.out.println(results[i]);
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        }
        System.out.println("Obrigado por usar nossa aplicação");
        socketClient.close();
    }
}
