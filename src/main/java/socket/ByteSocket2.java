package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

// Сервер присылает клиенту через сокет 100 байт. Считать эти байты и записать в файл

public class ByteSocket2 {
    public static void main(String[] args) {
        try(
            Socket socket = new Socket("localhost", 6969);
            InputStream is = socket.getInputStream();
            OutputStream os = new  FileOutputStream("file");
        ) {
            for (int i = 0; i < 100; i++) {
                os.write(is.read());
            }
            os.flush();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
