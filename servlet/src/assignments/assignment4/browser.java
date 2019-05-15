package assignments.assignment4;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/browser/*")
public class browser implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String userAgent = ((HttpServletRequest) request).getHeader("user-agent");

		if (userAgent.contains("Chrome")) {
			response.getWriter().println("Google Chrome");
		}

		else if (userAgent.contains("Firefox")) {
			response.getWriter().println("Mozilla Firfox");
		}

		chain.doFilter(request, response);
	}
}
