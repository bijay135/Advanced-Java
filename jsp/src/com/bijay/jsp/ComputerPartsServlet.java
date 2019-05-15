package com.bijay.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/computerparts")
public class ComputerPartsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ComputerPart> p = new ArrayList<>();
		ComputerPart c1 = new ComputerPart("MSI H81","Intel i3 8100","Nvidia GTX 1050Ti","8 GB","256 GB");
	    ComputerPart c2 = new ComputerPart("MSI H41","Intel i3 4100","Nvidia GTX 450Ti","8 GB","128 GB");
		ComputerPart c3 = new ComputerPart("MSI H51","Intel i3 5100","Nvidia GTX 550Ti","12 GB","512 GB");
		ComputerPart c4 = new ComputerPart("MSI H61","Iniel i3 6100","Nvidia GTX 650Ti","16 GB","1 TB");
		ComputerPart c5 = new ComputerPart("MSI H71","Intel i3 7100","Nvidia GTX 750Ti","32 GB","256 GB");
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(c4);
		p.add(c5);
		request.setAttribute("parts",p);
		request.getRequestDispatcher("ComputerPartsList.jsp").forward(request,response);
	}
}
