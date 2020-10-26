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


@WebServlet(name = "resp", urlPatterns = { "/resp" })
public class SimpleResp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomHttpServletResponse http_resp = new CustomHttpServletResponse(resp);
        CustomServletResponse serv_resp = new CustomServletResponse(resp);
        http_resp.setContentType("text/html;charset=UTF-8");
        http_resp.getWriter().println("In the servlet response");
        serv_resp.setContentType("text/html;charset=UTF-8");
        serv_resp.getWriter().println("In the servlet response");
        // Stores the value of the response but it is not currently outputted because there is no ServletOutputStream
        System.out.println(http_resp.toString());
        System.out.println(serv_resp.toString());
    }
}