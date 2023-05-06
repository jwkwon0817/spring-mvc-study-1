<%@ page import="com.codemos.servletstudy.domain.member.MemberRepository" %>
<%@ page import="com.codemos.servletstudy.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  // Be able to use request, response
  MemberRepository memberRepository = MemberRepository.getInstance();

  System.out.println("MemberSaveServlet.service");
  String username = request.getParameter("username");
  int age = Integer.parseInt(request.getParameter("age"));

  Member member = new Member(username, age);
  memberRepository.save(member);
%>

<html>
<head>
	<title>Save</title>
</head>
<body>
  Success
  <ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
  </ul>
  <a href="/index.html">Main</a>
</body>
</html>
