<%--
  Created by IntelliJ IDEA.
  User: tying
  Date: 2017/3/24
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/student/nav.jsp"></jsp:include>

<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">选课</h1>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        已开设课程信息
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>课程ID</th>
                                    <th>课程名称</th>
                                    <th>授课老师</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="section" items="${courseSelectionList}">
                                    <tr>
                                        <td>${section.course.courseId}</td>
                                        <td>${section.course.name}</td>
                                        <td>${section.teacher.name}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/elective.do/add?secId=${section.course.courseId}"
                                               onclick="return confirm('是否选择该课')">选课</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>

        <!-- /.container-fluid -->
    </div>
</div>
<!-- /#page-wrapper -->
<%--</div>--%>
<!-- /#wrapper -->
<jsp:include page="/bottom.jsp"></jsp:include>
