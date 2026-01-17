package servlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class MainServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        String imageName = req.getParameter("imageName");
        String path = "/resources/img/" + imageName;
        File file = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             OutputStream outputStream = resp.getOutputStream()) {
            resp.setContentType("image/jpeg");
            byte[] bytes = fileInputStream.readAllBytes();
            resp.setContentLength(bytes.length);
                    outputStream.write(bytes);
        } catch (Exception e) {}
    }
}
