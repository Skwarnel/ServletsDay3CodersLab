package pl.coderslab.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageParameterStr = request.getParameter("page");
        double pageParameterDouble = Double.parseDouble(pageParameterStr);
        int pageParameterInt = Integer.parseInt(pageParameterStr);
        List<Integer> dividers = new ArrayList<>();
        for (int i = 0; i < pageParameterInt; i++) {
            if (pageParameterDouble % i == 0) {
                dividers.add(i);
            }
        }
        response.getWriter().append(dividers.toString());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
