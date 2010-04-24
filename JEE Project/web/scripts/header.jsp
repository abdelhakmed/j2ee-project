<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="qcm.models.User" %>
<%
            /**
             * Fragment à inclure pour afficher le header de la page
             */
            User user = (User) request.getSession().getAttribute("user");
            if (user == null) {
                request.setAttribute("errorMessage", "Vous n'êtes pas connecté");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
%>
<p id="top">Bienvenue <%= user.getPrenom()%> <%= user.getNom()%>, <a href="<%= request.getContextPath()%>/logout.html">Déconnexion</a></p>
<div id="logo">
    <h1><a href="index.jsp">iQCM</a></h1>
</div>
<ul id="menu">
    <%
                if (user.getStatut().getLibelle().equals("Administrateur")) {
                    out.println("<li><a href='#'>Administrateur</a></li>");
                }
    %>
    <li><a href="Accueil?action=retourAccueil">Accueil</a></li>
    <li><a href="#">Actualité</a></li>
    <li><a href="#">A propos</a></li>
    <li><a href="#">Contact</a></li>
</ul>
<div class="line"></div>