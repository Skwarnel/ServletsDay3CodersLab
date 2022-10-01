package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet("/post2")
public class Form2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userText = req.getParameter("userText");
        String agreement = req.getParameter("agreement");

        List<String> swearingList = new ArrayList<String>();
        swearingList.add("kurw");
        swearingList.add("kurew");
        swearingList.add("dupa");
        swearingList.add("dziwka");
        swearingList.add("przypierdol");
        swearingList.add("jeba");
        swearingList.add("sukinsyn");
        swearingList.add("rucha");
        swearingList.add("dupy");
        swearingList.add("chuj");
        swearingList.add("fuck");
        swearingList.add("pierdalaj");

        if (Objects.nonNull(agreement)) {
            resp.getWriter().println(userText);
        } else {
            for (String swear : swearingList) {
                userText = userText.replaceAll(swear, swear.replaceAll("[a-zA-Z]", "*"));
            }
            resp.getWriter().append(userText);
        }
    }
}