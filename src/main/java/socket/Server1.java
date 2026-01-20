package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new  ServerSocket(8023);
        Socket clien1 = socket.accept();
        Socket client2 = socket.accept();
        InputStream is = clien1.getInputStream();
        OutputStream os = client2.getOutputStream();
        os.write(is.read());
        os.flush();
        clien1.close();
        client2.close();
    }
}
