package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.PreparedStatement;

@WebServlet("/language")
public class LanguageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/lang.jsp").forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
        String lang = req.getParameter("lang");

        System.out.println(lang);

        Cookie cookie = new Cookie("lang", lang);
        cookie.setMaxAge(60*60*30);

        cookie.setPath("/");

        req.setAttribute("lang", lang);

        rsp.addCookie(cookie);

        System.out.println(cookie.getName());

        req.getRequestDispatcher(req.getContextPath()+ "/jsp/lang").forward(req,rsp);
    }
}
