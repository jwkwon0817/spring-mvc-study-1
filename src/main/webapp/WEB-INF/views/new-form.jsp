<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

	<title>New Form</title>
</head>
<body>
  <!-- Use relative path, [ hierarchical path to which the current URL belongs + /save ] -->
  <form action="save" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">Send</button>
  </form>
</body>
</html>
