<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>

    <title>My JSP 'index.jsp' starting page</title>

  </head>

  <body>
    <h1><font color="red">Save User</font></h1>

    <s:form action="saveUser">
        <s:textfield name="user.userName" label="userName"></s:textfield>
        <s:textfield name="user.password" label="password"></s:textfield>
        <s:textfield name="user.gender" label="gender"></s:textfield>
        <s:submit></s:submit>
    </s:form>

  </body>
</html>