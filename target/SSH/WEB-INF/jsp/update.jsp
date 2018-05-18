<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>

    <title>My JSP 'update.jsp' starting page</title>

  </head>

  <body>
    <h1><font color="red">Update User</font></h1>

    <s:form action="updateUser">
    <table>
        <tr>
            <td>
                <s:hidden name="user.userId" value="%{user.userId}"></s:hidden>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="user.userName" value="%{user.userName}" label="userName"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="user.password" value="%{user.password}" label="password"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:textfield name="user.gender" value="%{user.gender}" label="gender"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <s:submit></s:submit>
            </td>
        </tr>
    </table>    
    </s:form>

  </body>
</html>