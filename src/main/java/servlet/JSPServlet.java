package servlet;

import entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/jsp")
public class JSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Product> list = new ArrayList();

        Product product = new Product("sone", "kpfu.ru", 115, true);
        Product product1 = new Product("sone", "kpfu.ru", 115, true);
        Product product2 = new Product("sone", "kpfu.ru", 115, true);

        list.add(product1);
        list.add(product2);
        list.add(product);

        req.setAttribute("list", list);
    }
}
