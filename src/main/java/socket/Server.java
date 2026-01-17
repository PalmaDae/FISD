package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5252);
        Socket client1 = serverSocket.accept();
        Socket client2 = serverSocket.accept();
        InputStream inputStream1 = client1.getInputStream();
        OutputStream outputStream2 = client2.getOutputStream();
        byte[] bytes = inputStream1.readAllBytes();
        outputStream2.write(bytes);
        client1.close();
        client2.close();
        serverSocket.close();
    }
}
