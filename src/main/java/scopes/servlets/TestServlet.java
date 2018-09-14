package scopes.servlets;

import org.jboss.weld.context.http.Http;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/test-servlet")
public class TestServlet extends HttpServlet {
}
