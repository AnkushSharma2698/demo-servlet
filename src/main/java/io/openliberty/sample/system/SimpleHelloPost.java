package io.openliberty.sample.system;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletName", urlPatterns = { "/path" })
public class  SimpleHelloPost extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		//Example usage of getting query parameter: /resource?param=1
		String param = req.getParameter("param");
		res.getWriter().println("Example HTTP POST request for HTTPServlet");
	}
}