package scopes.servlets;

import scopes.beans.InitialTime;
import scopes.beans.RequestTime;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.SECONDS;

@WebServlet("/test-servlet")
public class TestServlet extends HttpServlet {

    @Inject
    private
    RequestTime requestTime;

    @Inject
    private InitialTime initialTime;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LocalTime initial = LocalTime.parse(initialTime.getMessage());
        LocalTime requestTime = LocalTime.parse(this.requestTime.getMessage());
        long difference = initial.until(requestTime,SECONDS);

        PrintWriter writer = resp.getWriter();

        writer.println("request time " + requestTime.toString());
        writer.println("initial time " + initial.toString());

        writer.println("difference is = " + difference + " seconds");

    }
}
