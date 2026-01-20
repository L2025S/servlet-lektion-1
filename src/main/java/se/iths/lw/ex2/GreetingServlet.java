package se.iths.lw.ex2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        try {
            resp.getWriter().println("Hello from Servlet!");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
