<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr />
	<form:form action="process-homepage" method="get"
		modelAttribute="nameInfo">
		<div align="center">
			<p>
				<label for="name1">성씨 입력:</label>
				<form:input id="name1" path="lastName" />
			</p>
			<p>
				<label for="name2">이름 입력:</label>
				<form:input id="name2" path="firstName" />
			</p>

			<input type="submit" value="Bind Data" />

		</div>
	</form:form>
</body>
</html>