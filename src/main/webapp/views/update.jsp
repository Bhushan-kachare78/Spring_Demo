<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Update Page</h1>

<form action="update" method="post">
		Rollno : <input type="number" name="rollno" value="${stu.rollno}" readonly> <br><br>
		Name : <input type="text" name="name" value="${stu.name}"> <br><br>
		Email : <input type="email" name="email" value="${stu.email}"> <br><br>
		Contact : <input type="number" name="contact" value="${stu.contact}"> <br><br>
		Address : <input type="text" name="address" value="${stu.address}"> <br><br>
		Username: <input type="text" name="username" value="${stu.username}"><br> <br>
		Password: <input type="text" name="password" value="${stu.password }"> <br> <br>
		<button>UPDATE</button>
	</form>

</body>
</html>