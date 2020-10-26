package io.openliberty.sample.system;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "hello", urlPatterns = { "/hello" })
public class SimpleHello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        req.setAttribute("name", "Ankush Sharma");
        resp.getWriter().println(req.getAttribute("name"));
        resp.getWriter().println("Hello Jakarta EE 9!");
    }
}