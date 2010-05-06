<!--
    Page d'index / Accueil pour les utilisateur non connectés.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/screen.css" type="text/css" media="screen" title="css" charset="utf-8" />
        <title>Projet QCM</title>
    </head>
    <body>
        <div id="content">
            <p id="top">Bienvenue, merci de vous authentifier.</p>
            <div id="logo">
                <h1><a href="<%= request.getContextPath() %>">iQCM</a></h1>
            </div>
            <ul id="menu">
                <li><a href="<%= request.getContextPath() %>">Accueil</a></li>
                <li><a href="<%= request.getContextPath() %>/actualite.html">Actualité</a></li>
                <li><a href="<%= request.getContextPath() %>/apropos.html">A propos</a></li>
                <li><a href="<%= request.getContextPath() %>/contact.html">Contact</a></li>
            </ul>
            <div class="line"></div>

            <div id="body">
            <jsp:include page="scripts/login.jsp" />
            </div>
            <div id="footer">
                <p>&copy; Copyright 2009 Ferrand &ndash; Rabarison &mdash; Design: Lou Ferrand &ndash; Maria Rabarison, <a href="#" title="Projet Java">DagoFly</a></p>
            </div>
        </div>
    </body>
</html>
