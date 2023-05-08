package com.codemos.springmvstudy1.web.servlet;

import com.codemos.springmvstudy1.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("  <meta charset=\"UTF-8\">");
		writer.println("  <title>Title</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("  <form action=\"/servlet/members/save\" method=\"post\">");
		writer.println("    username: <input type=\"text\" name=\"username\" />");
		writer.println("    age: <input type=\"text\" name=\"age\" />");
		writer.println("    <button type=\"submit\">Send</button>");
		writer.println("  </form>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
