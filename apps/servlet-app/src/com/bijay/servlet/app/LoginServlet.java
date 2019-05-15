package com.bijay.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bijay.servlet.app.dao.UserDao;
import com.bijay.servlet.app.dto.User;
import com.bijay.servlet.app.utility.StringUtility;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter w = response.getWriter();

		w.println("<!DOCTYPE html>");
		w.println("<html>");
		w.println("<head>");
		w.println("<meta charset=\"utf-8\">");
		w.println("<title>Login Page</title>");
		w.println("</head>");
		w.println("<body>");
		w.println("<div align=\"center\" style=\"border:1px solid black;\">");
		if (request.getParameter("invalid") != null) {
			w.println("<label style=\"color:red;\">Invalid username & password. Please try again!!</label>");
			w.println("<br /><br />");
		} 
		else if (request.getParameter("logout") != null) {
			w.println("<label style=\"color:green;\">You are logged out successfully!!</label>");
			w.println("<br /><br />");
		}

		w.println("<form action=\"\" method=\"post\">");
		w.println("<label>Username : </label>");
		w.println("<input name=\"username\" />");
		w.println("<br />");
		w.println("<label>Password : </label>");
		w.println("<input name=\"password\" type=\"password\" />");
		w.println("<br />");
		w.println("<button type=\"submit\">Login</button>");
		w.println("</form>");
		w.println("</div>");

		w.println("</body>");
		w.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (!StringUtility.hasContent(username) || !StringUtility.hasContent(password)) {
			response.sendRedirect("login?invalid");
			return;
		}

		UserDao userDao = new UserDao();
		User user = userDao.findByUsernamePassword(username.trim(), password.trim());
		if (user == null) {
			response.sendRedirect("login?invalid");
		} 
		else {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("computer");
		}
	}
}
