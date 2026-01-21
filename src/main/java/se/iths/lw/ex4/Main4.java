package se.iths.lw.ex4;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main4 {
    static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");

        handler.setResourceBase("src/main/java/se/iths/lw/ex4/static/login.html");
        handler.addServlet(DefaultServlet.class,"/");

        handler.addServlet(new ServletHolder(new LoginServlet()),"/login");

        server.setHandler(handler);

        server.start();
        server.join();
    }
}
