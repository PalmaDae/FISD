package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

//В запросе передается параметр zimageName, написать код сервлета,
// который по этому запросу возвращает картинку. Нужно также дать понять клиенту, что мы вернули именно картинку (content type)

@WebServlet("/main")
public class MainServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String imageName = req.getParameter("imageName");

        String resPath = "/webapp/images/"+imageName;

        InputStream in = getServletContext().getResourceAsStream(resPath);

        String mimeType = getServletContext().getMimeType(resPath);

        resp.setContentType(mimeType);

        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());

        int byteR;
        while ((byteR = bis.read()) != -1) {
            bos.write(byteR);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}