package se.iths.lw.ex6;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main6 {
    public static void main(String[] args) throws Exception{
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        server.setHandler(handler);

        handler.addServlet(new ServletHolder(new MyFormServlet()),"/");
        handler.addServlet(new ServletHolder(new SubmitServlet()),"/submit");

        server.start();
        server.join();
    }
}

// instruction: http://localhost:8080/, then enter the username, and submit.