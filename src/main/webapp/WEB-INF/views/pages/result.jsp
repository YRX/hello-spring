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

  <div class="login">
	  <table>
		  <tr>
			  <td>${user.username}</td>
		  </tr>
		  <tr>
			  <td>${user.password}</td>
		  </tr>
		  <tr>
			  <td>${error}</td>
		  </tr>
	  </table>

  </div>

  <script src="${jsURL}"></script>

</body>

</html>