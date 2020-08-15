<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Une liste exhaustive</title>
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
	test<br>
	liste de tous les cinémas:
	<ul>
<c:forEach var="cinema" items="${cinemas}"><li>${cinema.nom }</li></c:forEach>
	</ul>
	List de cinéma ayant la salle d'id=1:
		<ul>
<c:forEach var="cinema" items="${cinemaBySalleId}"><li>${cinema.nom }</li></c:forEach>
	</ul>
	List de cinéma diffusant le film d'id=2:
		<ul>
<c:forEach var="cinema" items="${cinemaByFilmId}"><li>${cinema.nom }</li></c:forEach>
	</ul>

</body>
</html>