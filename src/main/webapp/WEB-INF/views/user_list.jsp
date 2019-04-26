<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table">
  <thead>
    <tr align="center">
      <th>ID</th>
      <th>NAME</th>
      <th>E-MAIL</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="row" items="${list}">
		<tr align="center">
			<td>${row.userId}</td>
			<td>${row.name}</td>
			<td>${row.email}</td>
		</tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>