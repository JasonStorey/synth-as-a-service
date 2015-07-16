package uk.co.jasonstorey.synthasaservice;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SynthServer {

    private Server server;

    private static class Handler extends AbstractHandler {

        @Override
        public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
            httpServletResponse.setContentType("text/html;charset=utf-8");
            httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            request.setHandled(true);
            httpServletResponse.getWriter().println("<h1>Hello World</h1>");
        }
    }

    public SynthServer() {
        server = new Server(8080);
        server.setHandler(new Handler());
    }

    public void start() throws Exception {
        server.start();
        server.join();
    }
}
