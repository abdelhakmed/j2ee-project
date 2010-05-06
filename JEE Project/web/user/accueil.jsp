<%
/**
 * Contenu d'accueil
 */
%>

<%@page import="qcm.models.User" %>
<%
    User user = (User) request.getSession().getAttribute("user");
%>
<h4>Accueil d'iQCM</h4>

<div id="statistiques">
    <p>Bienvenue sur l'application QCM du master MIAGE<br/>

    Votre statut vous permet de :</p>

    <ul class="liste">
        <li>&bull;&nbsp;Passer un Questionnaire</li>
        <li>&bull;&nbsp;Consulter les résultats des questionnaires que vous avez passés ainsi que leur correction</li>
        <%
            if(user.isCreator() ||user.isAdmin()){
        %>
        <li>&bull;&nbsp;Créer un questionnaire</li>
        <li>
            &bull;&nbsp;Editer un questionnaire que vous avez créé et consulter des différentes statistiques des résultats des utilisateurs qui l'ont passé.
            Un questionnaire n'est modifiable que si aucun utilisateur ne l'a encore passé.
        </li>
        <%
        }
            if(user.isAdmin()){
        %>
        <li>&bull;&nbsp;En tant qu'administrateur, vous pouvez gérer l'ensemble des éléments contituant cette application</li>
        <%
        }
        %>
    </ul>
   
</div>
