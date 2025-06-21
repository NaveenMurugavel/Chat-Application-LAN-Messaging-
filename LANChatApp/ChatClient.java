import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to chat server... Type your messages:");

            Thread readThread = new Thread(() -> {
                try {
                    String serverMsg;
                    while ((serverMsg = serverInput.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            });

            readThread.start();

            String userMsg;
            while ((userMsg = userInput.readLine()) != null) {
                serverOutput.println(userMsg);
            }

        } catch (IOException e) {
            System.out.println("Unable to connect to server.");
        }
    }
}