<%--
  Created by IntelliJ IDEA.
  User: tying
  Date: 2017/3/24
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link href="custom/student/css/logout.css" rel="stylesheet">
</head>
<br>
<%
    session.invalidate();
%>

<p>
    ：）您已成功注销，正在跳转至登陆页面！</br></br>
    ......
</p>

<%
    response.setHeader("refresh","1;url=login.jsp");
%>

</body>
</html>
