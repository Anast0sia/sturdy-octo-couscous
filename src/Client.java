import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Your name:");
        String name = reader.readLine();
        out.println(name);
        System.out.println(in.readLine());
    }
}