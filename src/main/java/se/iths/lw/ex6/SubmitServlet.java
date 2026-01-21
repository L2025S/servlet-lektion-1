package se.iths.lw.ex6;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        req.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");

        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().write("<h1> Successfully submitted the form. Username: " + username + "</h1>");
    }
}
