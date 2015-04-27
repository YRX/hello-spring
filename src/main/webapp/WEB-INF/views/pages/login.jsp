<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:url value="/resources/css/reset.css" var="cssURL_1" />
<c:url value="/resources/css/style.css" var="cssURL_2" />
<c:url value="/resources/js/login.js" var="jsURL"/>
<c:url value="/resources/image/login-logo.png" var="logoURL"/>

<html>

<head>

  <meta charset="UTF-8">

  <title>CodePen - Login </title>

  <link rel="stylesheet" href="${cssURL_1}">

    <link rel="stylesheet" href="${cssURL_2}">

</head>

<body>

  <form class="login" id="loginData" method="post">
		<div class="avatar">
      		<img src="${logoURL}">
		</div>
		<input type="text" name="username" placeholder="username" required>
		<div class="bar">
			<i></i>
		</div>
		<input type="password" name="password" placeholder="password" required>
		<button onclick="submitForm()" >Sign in</button>
  </form>

  <script src="${jsURL}"></script>

</body>

</html>