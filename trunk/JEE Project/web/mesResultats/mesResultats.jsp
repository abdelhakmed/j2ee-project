<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="qcm.models.QuestionnairePasse" %>

<h4>Mes questionnaires passés</h4>
<%
    List<QuestionnairePasse> questionnairesPasses = (List<QuestionnairePasse>) request.getAttribute("questionnairesPasses");
    if (questionnairesPasses != null && !questionnairesPasses.isEmpty()) {

        out.println("<table class='format'>");
%>
<tr>
    <th>Date</th>
    <th>Intitulé</th>
    <th>Note</th>
    <th>Limite de temps</th>
</tr>

<%
     for (QuestionnairePasse qP : questionnairesPasses) {
%>
<tr>
    <td class="centered"><%= qP.getDate()%></td>
    <td><a href="<%= request.getContextPath() %>/mesResultats/correction.html?questionnaire=<%= qP.getIdQuestionnaire()%>"><%= qP.getLibelleQuestionnaire()%></a></td>
    <td class="centered"><%= qP.getNote()%></td>
    <td class="centered">
        <%
            if (qP.getTemps() != null && qP.getTemps() > 0) {
                out.println(qP.getTemps());
            }
        %>

    </td>


</tr>
<%
    }
    out.println("</table>");
} else {
    out.println("Vous n'avez encore passé aucun questionnaire.");
}
%>
                