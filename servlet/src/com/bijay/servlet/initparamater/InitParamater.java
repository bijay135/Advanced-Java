package com.bijay.servlet.initparamater;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/initparamater", initParams = @WebInitParam(name = "email", value = "xyz@example.com"))
public class InitParamater extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = getInitParameter("email");
		PrintWriter w = response.getWriter();
		w.println("email :: " + email);
	}

}
