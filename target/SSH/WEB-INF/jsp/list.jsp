<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'list.jsp' starting page</title>
<script type="text/javascript">
	function del() {
		if (confirm("Are you sure?")) {
			return true;
		}
		return false;
	}
</script>
</head>

<body>
	<h1>
		<font color="red">Users List</font>
	</h1>
	<s:debug/>
	<s:a href="/SSH/index.jsp">返回</s:a>
	<table border="1" width="80%" align="center">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>密码</th>
			<th>性别</th>
			<th>删除</th>
			<th>更新</th>
		</tr>

		<s:iterator value="#request.list" var="user">
			<tr>
				<td align="center"><s:property value="#user.userId" /></td>
				<td align="center"><s:property value="#user.userName" /></td>
				<td align="center"><s:property value="#user.password" /></td>
				<td align="center"><s:property value="#user.gender" /></td>
				<td align="center"><s:a
						href="deleteUser.action?user.userId=%{#user.userId}"
						onclick="return del()">Delete</s:a></td>
				<td align="center"><s:a
						href="toUpdateView.action?user.userId=%{#user.userId}">Update</s:a></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>