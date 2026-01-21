package se.iths.lw.ex6;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class MyFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().write("""
                <!DOCTYPE html>
                <html>
                <head>
                <meta charset="UTF-8">
                <title>Sample for form submitting </title>
                </head>
                <body>
                <h1>Enter Username</h1>
                <form action="submit" method="POST">
                <input type="text" name="username" placeholder="Enter username">
                <button type="submit">Submit</button>
                </form>
                </body>
                </html>
                """);
    }
}
