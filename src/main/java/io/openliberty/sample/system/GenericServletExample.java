import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class GenericServletExample extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		res.getWriter().println("Example Generic Servlet");
	}
}