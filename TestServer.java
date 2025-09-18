//First Server programm needs to be created then the client.
package learningSockets;

import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        
        try {
            //Printing a message: waiting for incoming clients
            System.out.println("Waiting for clients...");   

            //Creating a ServerSocket object and passing a port number
            //Also the class needs to be imported
            ServerSocket ss = new ServerSocket(1234);   
            //To remove the squiggly error line on serversocket object, write it inside a try block. It probably throw an error, that's why.

            //Waiting for client connection, the serversocket object (ss) will accept the incoming client message
            //Also socket class needs to be imported
            Socket soc = ss.accept();

            //for checking if the connection is established or not
            System.out.println("Connection established...");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
