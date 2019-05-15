package com.bijay.servlet.hibernate.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bijay.servlet.hibernate.app.data.dao.StudentDao;
import com.bijay.servlet.hibernate.app.data.model.Gender;
import com.bijay.servlet.hibernate.app.data.model.Student;
import com.bijay.servlet.hibernate.app.data.model.User;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student List</title>");

		out.println("<style>");
		out.println("table, th, td { border: 1px solid black; border-collapse: collapse; }");
		out.println("</style>");

		out.println("</head>");
		out.println("<body>");

		HttpSession httpSession = request.getSession();
		out.println("<h2>");
		out.println("Hi, " + ((User) httpSession.getAttribute("user")).getUsername() + " ");
		out.println("<a href=\"logout\" title=\"Logout\">logout</a>");
		out.println("</h2>");

		out.println("<h2>Student Form</h2>");
		out.println("<form action=\"\" method=\"post\">");
		out.println("<label>Name : </label>");
		out.println("<input name=\"name\" />");
		out.println("<br />");
		out.println("<label>Age : </label>");
		out.println("<input name=\"age\" />");
		out.println("<br />");
		out.println("<label>Gender : </label>");
		out.println("<input name=\"gender\" type=\"radio\" value=\"Male\" checked=\"checked\" />");
		out.println("<label>Male</label>");
		out.println("<input name=\"gender\" type=\"radio\" value=\"Female\" />");
		out.println("<label>Female</label>");
		out.println("<br />");
		out.println("<label>Address : </label>");
		out.println("<input name=\"address\" />");
		out.println("<br />");
		out.println("<label>Phone No. : </label>");
		out.println("<input name=\"phoneNo\" />");
		out.println("<br />");
		out.println("<button type=\"submit\">Add</button>");
		out.println("</form>");

		out.println("<h2>Student List</h2>");
		out.println("<table style=\"width:100%\">");
		out.println("<tr>");
		out.println("<th>Id</th>");
		out.println("<th>Name</th>");
		out.println("<th>Age</th>");
		out.println("<th>Gender</th>");
		out.println("<th>Address</th>");
		out.println("<th>Phone No.</th>");
		out.println("</tr>");
		StudentDao studentDao = new StudentDao();
		for (Student student : studentDao.findAll()) {
			out.println("<tr>");
			out.println("<td>" + student.getId() + "</td>");
			out.println("<td>" + student.getName() + "</td>");
			out.println("<td>" + student.getAge() + "</td>");
			out.println("<td>" + student.getGender().getName() + "</td>");
			out.println("<td>" + student.getAddress() + "</td>");
			out.println("<td>" + student.getPhoneNo() + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = new Student();
		student.setName(request.getParameter("name"));
		student.setAge(Byte.parseByte(request.getParameter("age")));
		student.setGender(Gender.getGender(request.getParameter("gender")));
		student.setAddress(request.getParameter("address"));
		student.setPhoneNo(request.getParameter("phoneNo"));
		StudentDao studentDao = new StudentDao();
		studentDao.save(student);
		response.sendRedirect("student");
	}
}
