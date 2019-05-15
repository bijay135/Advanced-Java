package assignments.assignment3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servletform")
public class ServletForm extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter w = res.getWriter();
		w.println("<!DOCTYPE html>");
		w.println("<html>");
		w.println("<head>");
		w.println("<title>Insert title here</title>");
		w.println("</head>");
		w.println("<body>");
		w.println("<form>");
		w.println("<h1> Sample Form  </h1>");
		w.println("Username: <input type=\"text\" name=\"username\"/> <br/>");
		w.println("Password: <input type=\"password\" name=\"password\"/> <br/>");
		w.println("<input type=\"submit\" value=\"Login\" />");
		w.println("</form>");
		w.println("</body>");
		w.println("</html>");
	}
}
