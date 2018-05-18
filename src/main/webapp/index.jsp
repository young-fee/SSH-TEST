<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  <body>
    <h1><font color="red">Operation List</font></h1>
    <s:a href="toSaveView.action">Save User</s:a><br/>
    <s:a href="userList.action">List Users</s:a>
    <s:form action="findUser">
        <s:textfield name="user.userId" label="按照id查询"></s:textfield>
        <s:submit></s:submit>
    </s:form>
  </body>
</html>