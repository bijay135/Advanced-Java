package assignments.assignment5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productentry")
public class ProductEntry extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String brand = req.getParameter("brand");
		String category = req.getParameter("category");
		String price = req.getParameter("price");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String conUrl = "jdbc:mysql://localhost:3306/bijay";
			String conUser = "root";
			String conPass = "12345";
			Connection con = DriverManager.getConnection(conUrl, conUser, conPass);
			String query = "Insert into product (name,brand,category,price) values('" + name + "','" + brand + "','"
					+ category + "','" + price + "')";
			con.createStatement().executeUpdate(query);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		res.sendRedirect("productlist");
	}
}
