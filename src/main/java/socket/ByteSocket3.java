package socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ByteSocket3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6969);





        InputStream is = socket.getInputStream();
        OutputStream os = new FileOutputStream("file");

        for (int i = 0; i < 100; i++) {
            os.write(is.read());
        }

        os.flush();
        is.close();
        os.close();
    }
}
