package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Timer;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");
        String timeStr = req.getParameter("time");
        int time = Integer.parseInt(timeStr);
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(time);
        resp.addCookie(cookie);
        resp.sendRedirect("/cookie3.html");
    }
}
