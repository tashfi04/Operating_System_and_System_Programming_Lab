import java.io.*;
import java.net.*;

public class Client {

        private Socket socket = null;
        private DataInputStream input = null;
        private DataOutputStream output = null;

        public Client(String address, int port) {

            try {
                socket = new Socket(address, port);
                System.out.println("Connected");

                input = new DataInputStream(System.in);

                output = new DataOutputStream(socket.getOutputStream());

            } catch (UnknownHostException u) {
                System.out.println(u);
            } catch (IOException i) {
                System.out.println(i);
            }

            String line = "";

            while(!line.equals("Over")) {

                try {
                    line = input.readLine();
                    output.writeUTF(line);
                } catch (IOException i) {
                    System.out.println(i);
                } catch (NullPointerException n) {

                }
            }

            try {
                input.close();
                output.close();
                socket.close();
            } catch (IOException i) {
                System.out.println(i);
            }
        }

    public static void main(String[] args) {

        Client client = new Client("192.168.100.6", 6667);
    }
}
