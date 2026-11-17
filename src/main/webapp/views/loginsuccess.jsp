<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function deleteData() {
		if(confirm("Delete record....!!")) {
			document.fn.action="delete";
			document.fn.submit();
		}
	}
	
	function editdata(){
		if(confirm("Edit record....!!")){
			document.fn.action="edit";
			document.fn.submit();
			
		}
		
	}

</script>


</head>
<body>
<h1>Login Success</h1>
<form name="fn">
<table border="1">
<tr>
<th>Select</th>
<th>RollNo</th>
<th>Name</th>
<th>Email</th>
<th>Contact</th>
<th>address</th>
<th>Username</th>
<th>Password</th>
<th colspan="2">Action</th>

</tr>
 
 <c:forEach items="${data}" var="s">
<tr>
<td><input type="radio" name="rollno" value="${s.rollno}"></td>
<td>${s.rollno }</td>
<td>${s.name }</td>
<td>${s.email }</td>
<td>${s.contact }</td>
<td>${s.address }</td>
<td>${s.username }</td>
<td>${s.password }</td>
<td><button onclick="deleteData()" >DELETE</button></td>
<td> <button onclick="editdata()">Edit</button> </td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>