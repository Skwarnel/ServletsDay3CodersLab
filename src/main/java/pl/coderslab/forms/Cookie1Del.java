package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        boolean isUser = false;

        if (Objects.nonNull(null)) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("User")) {
                    isUser = true;
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                }
            }
        }
        if (isUser == false) {
            resp.getWriter().println("BRAK CIASTECZKA");
        }
    }
}
