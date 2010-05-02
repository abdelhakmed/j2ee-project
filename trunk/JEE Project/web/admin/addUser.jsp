<%-- 
    Document   : addUser
    Created on : 2 mai 2010, 16:51:50
    Author     : Lou
--%>

<%@page import="qcm.models.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h4>Ajouter un utilisateur</h4>
<%--<jsp:include page="scripts/errorViewHelper.jsp" />--%>

<div  class="choice">
    <form action="<%= request.getContextPath()%>/admin/users/ajouter.html" method="post">
        <table>
            <tr>
                <td><label for="libelle"><strong>Login : </strong></label></td>
                <td><input type="text" name="login" id="login" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="libelle"><strong>Nom : </strong></label></td>
                <td><input type="text" name="nom" id="nom" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="libelle"><strong>Prénom : </strong></label></td>
                <td><input type="text" name="prenom" id="prenom" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="libelle"><strong>Email : </strong></label></td>
                <td><input type="text" name="email" id="email" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="libelle"><strong>Mot de passe : </strong></label></td>
                <td><input type="text" name="password" id="password" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="libelle"><strong>Répétez le mot de passe : </strong></label></td>
                <td><input type="text" name="password" id="password" value="" size="50" class="medium-input" /></td>
            </tr>
            <tr>
                <td><label for="statut"><strong>Statut : </strong></label></td>
                <td>
                    <select id="statut" name="statut" class="medium-input">
                        <option></option>
                    </select>
                </td>
            </tr>
        </table>
        <input type="submit" value="Enregistrer" class="button" />
        <a href="<%= request.getContextPath()%>/admin/users/index.html" class="button">Annuler</a>
    </form>
</div>
