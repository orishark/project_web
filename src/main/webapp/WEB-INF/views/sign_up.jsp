<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
	<div class="container">
		<form action="/create" method="post">
		  <div class="form-group">
		    <label for="name">이름</label>
		    <input type="text" class="form-control" name="name" placeholder="name">
		  </div>
		  <div class="form-group">
		    <label for="userId">사용자 아이디</label>
		    <input type="text" class="form-control" name="userId" placeholder="userId">
		  </div>
		  <div class="form-group">
		    <label for="password">비밀번호</label>
		    <input type="password" class="form-control" name="password" placeholder="password">
		  </div>
		   <div class="form-group">
		    <label for="checkPassword">비빌번호 확인</label>
		    <input type="password" class="form-control" name="checkPassword" placeholder="checkPassword">
		  </div>
		   <div class="form-group">
		    <label for="email">이메일</label>
		    <input type="email" class="form-control" name="email" placeholder="이메일">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>