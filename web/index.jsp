<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/25 0025
  Time: 上午 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>购买基金页面</title>
  </head>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/buyFund.do">
    银行账户:<input type="text" name="aname"><br>
    购买金额:<input type="text" name="balance"><br>
    基金名称:<input type="text" name="fname"><br>
    购买数量:<input type="text" name="amount"><br>
    <input type="submit" value="购买">
  </form>
  </body>
</html>
