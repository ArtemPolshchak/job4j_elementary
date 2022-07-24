package clientserverjava;

import java.net.*;
import java.io.*;
/**
 * @author artem.polshchak@gmail.com on 20.03.2022.
 * @project socket
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server Started");
        while (!serverSocket.isClosed()) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client accepted " + (++count));
            OutputStreamWriter out = new OutputStreamWriter(clientSocket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //out.write("HTTP/1.1 200 OK\r\n\r\n");
            //out.write("<h1>Java<h1>" + (++count));
            String request = reader.readLine();
            Thread.sleep(3000);
            String response = "Your message length is " + request.length() + "\n";
            out.write(response);
            out.flush();
            out.close();
            clientSocket.close();
            reader.close();

        }
    }
}
