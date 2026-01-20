package se.iths.lw.ex2;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main2 {
    static void main(String[] args) throws Exception{
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("/");
        handler.addServlet(GreetingServlet.class, "/greeting");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
