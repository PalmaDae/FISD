package servlet;

import entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sortType = req.getParameter("sortType");
        int page = Integer.parseInt(req.getParameter("page"));
        int maxCost = Integer.parseInt(req.getParameter("maxCost"));

        HttpSession session = req.getSession();

//        List<Product> list = productService.getProductsBySort(page, sortType);
//
//        session.setAttribute("list", list);

        resp.sendRedirect(req.getContextPath() + "/cart");
    }
}
