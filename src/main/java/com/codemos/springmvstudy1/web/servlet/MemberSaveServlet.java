package com.codemos.springmvstudy1.web.servlet;

import com.codemos.springmvstudy1.domain.member.Member;
import com.codemos.springmvstudy1.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/members/save")
public class MemberSaveServlet extends HttpServlet {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberSaveServlet.service");
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Member member = new Member(username, age);
		memberRepository.save(member);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("  <meta charset=\"UTF-8\">");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("  Success");
		writer.println("  <ul>");
		writer.println("    <li>id=" + member.getId() + "</li>");
		writer.println("    <li>username=" + member.getUsername() + "</li>");
		writer.println("    <li>age=" + member.getAge() + "</li>");
		writer.println("  </ul>");
		writer.println("  <a href=\"/index.html\">Main</a>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
