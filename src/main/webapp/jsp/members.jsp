<%@ page import="com.codemos.servletstudy.domain.member.MemberRepository" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codemos.servletstudy.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>

<html>
<head>
  <meta charset="UTF-8">
	<title>Members</title>
</head>
<body>
  <a href="/index.html">Main</a>
  <table>
    <thead>
    <tr>
      <th>id</th>
      <th>username</th>
      <th>age</th>
    </tr>
    </thead>
    <tbody>
    <%
      for (Member member : members) {
        out.println("<tr>");
        out.println("      <td>" + member.getId() + "</td>");
        out.println("      <td>" + member.getUsername() + "</td>");
        out.println("      <td>" + member.getAge() + "</td>");
        out.write("    </tr>");
      }
    %>
    </tbody>
  </table>
</body>
</html>
