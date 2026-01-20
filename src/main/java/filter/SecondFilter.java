package filter;

import entity.User;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SecondFilter extends HttpFilter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) req).getSession();

        HttpServletResponse response = (HttpServletResponse) resp;

        String path = ((HttpServletRequest) req).getServletPath();

        User user = (User) session.getAttribute("user");

        if (path.equals("/admin") && !(user.role == "ADMIN")) {
            response.sendRedirect(((HttpServletRequest) req).getContextPath()+"/main");
            chain.doFilter(req,resp);
            return;
        }

        chain.doFilter(req,resp);
    }
}
