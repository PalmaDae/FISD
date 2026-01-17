package socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

// Сервер присылает клиенту через сокет 100 байт. Считать эти байты и записать в файл

public class ByteSocket {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 6969;

        try(
            Socket socket = new Socket(host,port);
            InputStream in = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream("file")
        ) {
            byte[] bytes = new byte[100];

            int total = 0;

            while (total < 100) {
                int read = in.read(bytes, total, 100 -total);

                if (read == -1) {
                    break;
                }

                total += read;
            }

            fos.write(bytes, 0 ,total);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
