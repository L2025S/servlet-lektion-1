package se.iths.lw.ex1;
import org.eclipse.jetty.servlet.ServletContextHandler;
public class Main1 {
    static void main(String[] args) throws Exception {

        var server = new org.eclipse.jetty.server.Server(8080);

        var context = new ServletContextHandler();

        server.setHandler(context);

        context.addServlet(RootServlet.class, "/");
        context.addServlet(HelloServlet.class,"/hello/*");
        server.start();
        server.join();

    }
}
