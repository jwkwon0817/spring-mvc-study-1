package com.codemos.springmvstudy1.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 1. Parameter sending method
 * <a href="http://localhost:8080/request-param?username=hello&age=20">example url</a>
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ Entire Parameter Inquiry ] - start");
		
		request.getParameterNames().asIterator()
						.forEachRemaining(paramName -> System.out.println(paramName + " = " + request.getParameter(paramName)));
		
		System.out.println("[ Entire Parameter Inquiry ] - end");
		System.out.println();
		
		System.out.println("[ Individual Parameter Inquiry ] - start");
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		System.out.println("username = " + username);
		System.out.println("age = " + age);
		System.out.println("[ Individual Parameter Inquiry ] - end");
		System.out.println();
		
		System.out.println("[ Same Parameter Name Inquiry ] - start");
		String[] usernames = request.getParameterValues("username");
		for (String name : usernames) {
			System.out.println("username = " + name);
		}
		
		System.out.println("[ Same Parameter Name Inquiry ] - end");
		
		response.getWriter().write("ok");
	}
}
