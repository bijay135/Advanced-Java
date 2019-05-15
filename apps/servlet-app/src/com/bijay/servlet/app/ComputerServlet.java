package com.bijay.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bijay.servlet.app.dao.ComputerDao;
import com.bijay.servlet.app.dto.Computer;
import com.bijay.servlet.app.dto.User;


@WebServlet("/computer")
public class ComputerServlet extends HttpServlet {
	Computer computer = new Computer();
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Computer Builder</title>");

		out.println("<style>");
		out.println(".one { border: 1px solid black;}");
		out.println(".table, th, td { border: 1px solid black; border-collapse: collapse; }");
		out.println("</style>");

		out.println("</head>");
		out.println("<body>");

		HttpSession httpSession = request.getSession();
		out.println("<h2>");
		out.println("Hi, " + ((User) httpSession.getAttribute("user")).getUsername()+" ");
		out.println("<a href=\"logout\" title=\"Logout\">logout</a>");
		out.println("</h2>");
		
		out.println("<div align=\"center\" class=\"one\">");
		out.println("<h1> Computer builder by price Form</h1>");
		out.println("<form action=\"\" method=\"post\">");
		out.println("<h2> Choose your price to suggest a Computer. <br>");
		out.println("Only the main PC will be included </h2>");
		out.println("<input name=\"price\" type=\"radio\" value=\"200\"/>");
		out.println("<label>200$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"300\"/>");
		out.println("<label>300$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"400\"/>");
		out.println("<label>400$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"500\"/>");
		out.println("<label>500$</label>");
		out.println("<br>");
		out.println("<input name=\"price\" type=\"radio\" value=\"600\"/>");
		out.println("<label>600$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"700\"/>");
		out.println("<label>700$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"800\"/>");
		out.println("<label>800$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"900\"/>");
		out.println("<label>900$</label>");
		out.println("<br>");
		out.println("<input name=\"price\" type=\"radio\" value=\"1000\"/>");
		out.println("<label>1000$</label>");
		out.println("<input name=\"price\" type=\"radio\" value=\"2500\"/>");
		out.println("<label>More Than 1500$ </label>");
		out.println("<br> <br>");
		out.println("<button type=\"submit\" > Build a desktop at this price range </button>");
		out.println("</form>");
		
		out.println("<table style=\"width:100%\">");
		out.println("<h2> Click on button to fill the table below </h2>");
		out.println("<tr>");
		out.println("<th> Casing </th>");
		out.println("<th> Motherboard </th>");
		out.println("<th> CPU </th>");
		out.println("<th> GPU </th>");
		out.println("<th> RAM</th>");
		out.println("<th> Storage</th>");
		out.println("<th> Power Supply</th>");
		out.println("</tr>");
		
		ComputerDao computerdao = new ComputerDao();;
		for(Computer c : computerdao.findByPrice(computer.getPrice())) {
			out.println("<tr>");
			out.println("<td>" + c.getCasing() + "</td>");
			out.println("<td>" + c.getMotherboard() + "</td>");
			out.println("<td>" + c.getCpu() + "</td>");
			out.println("<td>" + c.getGpu() + "</td>");
			out.println("<td>" + c.getRam() + "</td>");
			out.println("<td>" + c.getStorage() + "</td>");
			out.println("<td>" + c.getPowersupply() + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<p> Your total price is : $" +computer.getPrice()+ "</P>");
		out.println("</div>");
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		computer.setPrice(Integer.parseInt(request.getParameter("price")));
		response.sendRedirect("computer");
	}
}
