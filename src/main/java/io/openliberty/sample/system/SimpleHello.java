package io.openliberty.sample.system;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.*;


@WebServlet(name = "hello", urlPatterns = { "/hello" })
public class SimpleHello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setAttribute("name", "Ankush Sharma");
        // Wrap the request in the new wrapper
        CustomHttpServletRequest http_serv_req = new CustomHttpServletRequest(req);
        CustomServletRequest serv_req = new CustomServletRequest(req);
        resp.getWriter().println(http_serv_req.getAttribute("name"));
        resp.getWriter().println(http_serv_req.getParameter("param1"));
        resp.getWriter().println("<br>");
        resp.getWriter().println(serv_req.getAttribute("name"));
        resp.getWriter().println(serv_req.getParameter("param2"));
    }
}