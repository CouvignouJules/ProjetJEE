<%@page import="ynovM.service.StationPOJO"%>
<%@page import="java.util.List"%>
<%@page import="ynovM.controleur.Manager"%>
<%@taglib uri="WEB-INF/tld/c.tld" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mappemonde - Gestion météo Ynov</title>
</head>
<body>
	<form name="fstation" action="main" method="POST">
		<nav>
			<ul class="m">
				<li class="m"><a href="ajouter.jsp">Ajouter une station</a></li>
				<li class="m"><a href="supprimer">Supprimer la station sélectionnée</a></li>
				<li class="m"><a href="redemarrer">Redémarrer la station sélectionnée</a></li>
			</ul>
		</nav>
	</form>
</body>
</html>