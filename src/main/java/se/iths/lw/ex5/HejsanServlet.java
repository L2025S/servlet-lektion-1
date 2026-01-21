package se.iths.lw.ex5;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hejsan")
public class HejsanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");

        resp.getWriter().println("""
                <html> 
                    <head>
                        <title>Hello World!</title>
                    </head>
                    <body>
                        <h1>Hello, Jetty Servlet!</h1>
                        <p>Det är en HTML sida. </p>
                    
                    </body>   
                </html>
                """);
    }
}
