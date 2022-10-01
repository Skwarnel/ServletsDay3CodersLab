package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post1")
public class Form1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
//"<head> <meta charset='UTF-8'></head>" +
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().append("Witaj, " + firstName + " " + lastName);
    }
}
