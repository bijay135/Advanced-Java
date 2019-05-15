package com.bijay.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> names = new ArrayList<>();
		names.add("Aviskar");
		names.add("Aashish");
		names.add("Sabin");
		names.add("Bijay");
		request.setAttribute("names", names);
		request.setAttribute("address", "");
		request.setAttribute("date", new Date());
		request.setAttribute("num", Math.PI);
		request.getRequestDispatcher("Student.jsp").forward(request, response);
	}
}
