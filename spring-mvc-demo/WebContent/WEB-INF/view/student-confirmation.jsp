<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName} from : ${student.country}
<br>

favorite ${student.favoriteLanguage}

<a href = "showForm"> Student form</a>
<br>
<a href = "/spring-mvc-demo/hello/showForm"> Hello world form</a>
</body>

</html>







