<%--
  Created by IntelliJ IDEA.
  User: tying
  Date: 2017/3/25
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/custom/static/js/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/custom/static/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="${pageContext.request.contextPath}/custom/static/metisMenu/dist/metisMenu.min.js"></script>

<!-- custom Theme JavaScript -->
<script src="${pageContext.request.contextPath}/custom/static/dist/js/sb-admin-2.js"></script>

<!-- DataTables JavaScript -->
<script src="${pageContext.request.contextPath}/custom/static/datatables/media/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/custom/static/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>

</body>
</html>
