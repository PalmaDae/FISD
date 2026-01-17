package socket;

import java.io.*;
import java.net.Socket;

//Отправить http запрос через сокеты (в http запросе передаётся название товара, категория)

public class HtttpGetProduct {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 6969;

        String name = "someProduct";
        String category = "someCategory";

        String req = "GET /search?product=" + name + "&category=" + category + " HTTP/1.1\n"
                +"Host" + host + "\n"
                +"Connection: close";

        Socket socket = new Socket(host, port);

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.write(req);
        out.flush();

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        socket.close();
    }
}
