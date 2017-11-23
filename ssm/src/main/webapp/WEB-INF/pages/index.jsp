<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${users}" var="user">
		<ul>
			<li>${user.username}</li>
			<li>${user.account}</li>
			<li>${user.headerPic}</li>
			<li>${user.createTime}</li>
		</ul>
	</c:forEach>
</body>
</html>