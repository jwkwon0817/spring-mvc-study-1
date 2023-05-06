package com.codemos.servletstudy.web.servlet;

import com.codemos.servletstudy.domain.member.Member;
import com.codemos.servletstudy.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member> members = memberRepository.findAll();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("  <meta charset=\"UTF-8\">");
		writer.println("  <title>Title</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("  <a href=\"/index.html\">Main</a>");
		writer.println("  <table>");
		writer.println("    <thead>");
		writer.println("    <th>id</th>");
		writer.println("    <th>username</th>");
		writer.println("    <th>age</th>");
		writer.println("    </thead>");
		writer.println("    <tbody>");
		
		for (Member member : members) {
			writer.println("	<tr>");
			writer.println("		<td>" + member.getId() + "</td>");
			writer.println("		<td>" + member.getUsername() + "</td>");
			writer.println("		<td>" + member.getAge() + "</td>");
			writer.println("	</tr>");
		}
		
		writer.println("    </tbody>");
		writer.println("  </table>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
