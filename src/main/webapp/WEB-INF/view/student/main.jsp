<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/student/nav.jsp"></jsp:include>


<%--
  Created by IntelliJ IDEA.
  User: tying
  Date: 2017/3/23
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">学生主页</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        学生主页
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>

    <!-- /.container-fluid -->
</div>
</div>
<!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
<jsp:include page="/bottom.jsp"></jsp:include>






<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>选课管理信息系统</title>--%>
    <%--<link href="${pageContext.request.contextPath}/custom/student/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="${pageContext.request.contextPath}/custom/student/css/index.css" rel="stylesheet">--%>
    <%--<link href="${pageContext.request.contextPath}/custom/student/css/student.css" rel="stylesheet">--%>
<%--</head>--%>
<%--<body>--%>

<%--<%--%>
    <%--if (session.getAttribute("currentUser") == null) {--%>
        <%--response.sendRedirect("../index.jsp");--%>
    <%--}--%>
<%--%>--%>

<%--<c:if test="${currentUser.role == 1}">--%>
    <%--<% response.sendRedirect("../admin/index.jsp"); %>--%>
<%--</c:if>--%>
<%--<c:if test="${currentUser.role == 3}">--%>
    <%--<% response.sendRedirect("../teacher/index.jsp"); %>--%>
<%--</c:if>--%>

<%--<!-- Fixed navbar -->--%>
<%--<nav class="navbar navbar-default navbar-fixed-top">--%>
    <%--<div class="container">--%>
        <%--<div class="navbar-header">--%>
            <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">--%>
                <%--<span class="sr-only">Toggle navigation</span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
            <%--</button>--%>
            <%--<a class="navbar-brand" href="#">SDUTSSCM</a>--%>
        <%--</div>--%>
        <%--<div id="navbar" class="collapse navbar-collapse">--%>
            <%--<ul class="nav navbar-nav">--%>
                <%--&lt;%&ndash;<li><a href="main.jsp">首页</a></li>&ndash;%&gt;--%>
                <%--<li><a href="announce.jsp">公告</a></li>--%>
                <%--<li><a href="${pageContext.request.contextPath}/selective">选课</a></li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">信息查询 <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="grade_info.jsp">成绩查询</a></li>--%>
                        <%--<li><a href="scourse_info.jsp">选课情况查询</a></li>--%>
                        <%--&lt;%&ndash;<li><a>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<form action="infoscource.jsp">&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<input type="submit" value="选课情况查询"/>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</form>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</a>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                    <%--</ul>--%>
                <%--</li>--%>
                <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人信息 <span class="caret"></span></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                        <%--<li><a href="pwd_change.jsp">密码修改</a></li>--%>
                        <%--<li><a href="info_change.jsp">个人信息修改</a></li>--%>
                    <%--</ul>--%>
                <%--</li>--%>
            <%--</ul>--%>
            <%--<ul class="nav navbar-nav navbar-right">--%>
                <%--<li><a>欢迎您，${currentUser.username}同学！</a></li>--%>
                <%--<li><a href="../logout.jsp">【注销】</a></li>--%>
            <%--</ul>--%>
        <%--</div><!--/.nav-collapse -->--%>
    <%--</div>--%>
<%--</nav>--%>

<%--<footer class="footer">--%>
    <%--<div class="container">--%>
        <%--<p class="text-muted">--%>
            <%--Copyright &copy 2016 <a href="http://ttop5.net/"> ttop5 </a>. All right reserved.--%>
        <%--</p>--%>
    <%--</div>--%>
<%--</footer>--%>

<%--<div class="container">--%>
    <%--<div class="page-header">--%>
        <%--<h2>选课管理系统-student</h2>--%>
    <%--</div>--%>
<%--</div>--%>

<%--<script src="${pageContext.request.contextPath}/custom/student/js/jquery.min.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}/custom/student/js/bootstrap.min.js"></script>--%>

<%--</body>--%>
<%--</html>--%>
