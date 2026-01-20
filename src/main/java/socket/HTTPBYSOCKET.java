package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class HTTPBYSOCKET {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3213);

        String name = "some";

        String host = "localhost";

        String cat = "cate";

        String http = "GET /search?product=" + name + "&category=" + cat+ " HTTP/1.1\n" +
                "Host: localhost\n"+
                "Content-Type: application/json\n" +
                "Content-Length: 2437" +
                "Connection: close";

        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());

        os.write(http);

        os.flush();
    }
}
