package learningSockets;

import java.net.Socket;

public class TestClient {
    public static void main(String[] args) {

        try {
            System.out.println("Client connected...");

            //Creation of socket object (soc) and import the class
            //the localhost can also be replaced with ip address that is 127.0.0.1
            Socket soc = new Socket("localhost", 1234);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
