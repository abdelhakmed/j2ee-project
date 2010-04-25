<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="qcm.models.Question" %>
<%@page import="qcm.models.Reponse" %>
<%@page import="java.util.List" %>

<%
            Question question = (Question) request.getAttribute("question");
%>
<h4>Modifier une question</h4>
<form action="<%= request.getContextPath()%>/mesQuestionnaires/enregistrementQuestion.html" method="post">
    <table>
        <tr>
            <td>
                <em>Libellé de la question : </em>
            </td>
            <td>
                <textarea id="libelleQuestion" name="libelleQuestion" cols="69" rows="5"><%= question.getLibelle() %></textarea>
            </td>
        </tr>
    </table>
    <input type="hidden" name="idQuestion" value="<%= question.getIdQuestion() %>" />
    <table id="question_a_ajouter" class="format question-a-ajouter">
        <tr>
            <th>Réponse</th>
            <th>Libellé</th>
            <th>Descriptif</th>
            <th>Note</th>
            <th>Réponse correcte</th>
        </tr>
        <%
                    int index=1;
                    List<Reponse> reponses = question.getReponses();
                    for (Reponse reponse : reponses) {
                        out.println("<tr>");
                        out.println("<td class='centered'><strong>" + index + "</strong></td>");
                        out.println("<td><input type='text' name='libelleReponse_" + reponse.getIdReponse() + "' value='" + reponse.getLibelle() + "' class='medium-input' /></td>");
                        out.println("<td><input type='text' name='descriptifReponse_" + reponse.getIdReponse() + "' value='" + reponse.getDescriptif() + "' class='medium-input' size='27' /></td>");
                        out.println("<td><input type='text' name='noteReponse_" + reponse.getIdReponse() + "' value='" + reponse.getNote() + "' class='medium-input' size='4' /></td>");
                        out.println("<td class='centered'><input type='checkbox' name='estCorrecteReponse_" + reponse.getIdReponse() + "'");
                        if(reponse.estCorrecte()){
                            out.println(" checked = 'checked' ");
                        }
                        out.println(" class='medium-input' /></td>");
                        out.println("</tr>");
                        index++;
                    }
        %>
    </table>
    <input type="submit" name="action" value="Enregistrer les modifications" class="button" />
</form>
    <br/>
    <br/>

    <a href="<%= request.getContextPath() %>/mesQuestionnaires/index.html">Retour à la liste de vos questionnaires</a>
