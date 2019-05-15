package assignments.assignment5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productlist")
public class ProductList extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter w = res.getWriter();
		w.println("<!DOCTYPE html>");
		w.println("<html>");
		w.println("<head>");
		w.println("<title>Product List</title>");

		w.println("<style>");
		w.println("table, th, td { border: 1px solid black; border-collapse: collapse; }");
		w.println("</style>");

		w.println("</head>");
		w.println("<body>");
		w.println("<h2>Product List</h2>");
		w.println("<table style=\"width:100%\">");

		w.println("<tr>");
		w.println("<th>Id</th>");
		w.println("<th>Name</th>");
		w.println("<th>Brand</th>");
		w.println("<th>Category</th>");
		w.println("<th>Price</th>");
		w.println("</tr>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String conUrl = "jdbc:mysql://localhost:3306/bijay";
			String conUser = "root";
			String conPass = "12345";
			Connection con = DriverManager.getConnection(conUrl, conUser, conPass);
			ResultSet rs = con.createStatement().executeQuery("select * from product");

			while (rs.next()) {
				w.println("<tr>");
				w.println("<td>" + rs.getString(1) + "</td>");
				w.println("<td>" + rs.getString(2) + "</td>");
				w.println("<td>" + rs.getString(3) + "</td>");
				w.println("<td>" + rs.getString(4) + "</td>");
				w.println("<td>" + rs.getString(5) + "</td>");
				w.println("</tr>");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		w.println("</table>");
		w.println("</body>");
		w.println("</html>");
	}
}
