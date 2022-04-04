package clientServerJava;

import java.net.*;
import java.io.*;
/**
 * @author artem.polshchak@gmail.com on 20.03.2022.
 * @project socket
 */

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 8000);

        OutputStreamWriter out = new OutputStreamWriter(client.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        out.write("Get me some information\n");
        out.flush();

        String response = reader.readLine();
        System.out.println(response);
        client.close();
        reader.close();
        out.close();
    }
}
