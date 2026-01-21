package se.iths.lw.ex3;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main3 {
    static void main(String[] args) throws Exception{
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");

        handler.addServlet(new ServletHolder(new HiServlet()), "/hej");
        server.setHandler(handler);

        server.start();
        server.join();
    }
}
