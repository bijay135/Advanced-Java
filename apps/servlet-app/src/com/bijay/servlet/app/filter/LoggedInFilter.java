package com.bijay.servlet.app.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class LoggedInFilter extends HttpFilter {

	private static final long serialVersionUID = 1L;

	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String requestUri = request.getRequestURI();
		if (requestUri != null) {
			if (requestUri.startsWith(request.getContextPath() + "/login")) {
				HttpSession httpSession = request.getSession(false);
				if(httpSession != null && httpSession.getAttribute("user") != null) {
					response.sendRedirect(request.getContextPath() + "/computer");
					return;
				}
			} 
			else {
				HttpSession httpSession = request.getSession(false);
				if(httpSession == null || httpSession.getAttribute("user") == null) {
					response.sendRedirect(request.getContextPath() + "/login");
					return;
				}
			}
		}
		chain.doFilter(request, response);
	}
}
